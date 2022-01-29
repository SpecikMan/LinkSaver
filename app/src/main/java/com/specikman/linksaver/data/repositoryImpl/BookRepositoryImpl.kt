package com.specikman.linksaver.data.repositoryImpl

import com.specikman.linksaver.domain.repository.BookRepository

class BookRepositoryImpl(
    api: FirebaseAPI
): BookRepository {

    override suspend fun getBooks(): List<String> {
        TODO("Not yet implemented")
    }

    override suspend fun getBook(id: String): String {
        TODO("Not yet implemented")
    }

    override suspend fun addBook(book: String) {
        TODO("Not yet implemented")
    }

    override suspend fun updateBook(book: String) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteBook(book: String) {
        TODO("Not yet implemented")
    }
}