package com.myself223.data.base.repository

import com.myself223.common.Either
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

fun<T> makeNetworkRequest (
    gatherIsSucceed: ((T)->Unit)? = null,
    request:suspend () -> T

) = flow<Either<String, T>> {
    request().also {
        gatherIsSucceed?.invoke(it)
        emit(Either.Right(value = it))
    }
}.flowOn(Dispatchers.IO).catch {e->
    emit(Either.Left( value = e.localizedMessage?:"Error Occurred!"))

}


