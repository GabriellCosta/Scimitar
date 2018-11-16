package com.creations.scimitar_runtime.state

sealed class Status {
    object Success : Status()
    object Error : Status()
    object Loading : Status()
    object NoResults : Status()
}

data class StateError(val error: Throwable)
data class State<T>(val data: T, val status: Status = Status.Loading, val error: StateError? = null)
