package com.book.server.service;


import com.book.server.BookRequest;
import com.book.server.BookResponse;
import com.book.server.BookServiceGrpc;
import com.book.server.Data.SaveBookData;
import com.book.server.entity.Book;
import io.grpc.stub.StreamObserver;
import org.springframework.grpc.server.service.GrpcService;

@GrpcService
public class BookServiceImpl extends BookServiceGrpc.BookServiceImplBase {
    @Override
    public void getBookDetails(BookRequest request, StreamObserver<BookResponse> responseObserver) {
        Book book = SaveBookData.getBookById(request.getBookId());

        BookResponse response;
        if (book != null) {
            response = BookResponse.newBuilder()
                    .setBookId(book.getBookId())
                    .setTitle(book.getTitle())
                    .setAuthor(book.getAuthor())
                    .setGenre(book.getGenre())
                    .setPublishedYear(book.getPublishedYear())
                    .build();


        } else {
            response = BookResponse.newBuilder()
                    .setBookId(-1)
                    .setTitle("Not Found")
                    .setAuthor("N/A")
                    .setGenre("N/A")
                    .setPublishedYear(-1)
                    .build();

        }

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
