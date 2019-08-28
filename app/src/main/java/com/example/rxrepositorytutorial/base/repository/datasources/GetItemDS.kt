package com.example.rxrepositorytutorial.base.repository.datasources

import io.reactivex.Observable

interface GetItemWithIdentifierDS<T : Any, Identifier> {
    fun get(identifier: Identifier): Observable<T>
}

interface GetItemDS<T : Any> : GetItemWithIdentifierDS<T, String>
