package com.specikman.linksaver.domain.repository

interface BookRepository {
    suspend fun getBooks(): List<String>

    suspend fun getBook(id: String): String

    suspend fun addBook(book: String)

    suspend fun updateBook(book: String)

    suspend fun deleteBook(book: String)
}