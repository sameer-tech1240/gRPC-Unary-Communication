package com.book.client.service;

import com.book.server.BookRequest;
import com.book.server.BookResponse;
import com.book.server.BookServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Service;

@Service
public class BookServiceClient {

    private final BookServiceGrpc.BookServiceBlockingStub stub;

    public BookServiceClient() {
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 8080)  // your gRPC server port
                .usePlaintext()
                .build();
        this.stub = BookServiceGrpc.newBlockingStub(channel);
    }

    public BookResponse getBookById(int id) {
        BookRequest request = BookRequest.newBuilder().setBookId(id).build();
        return stub.getBookDetails(request);
    }

}
