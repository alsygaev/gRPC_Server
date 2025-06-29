package ru.education.spring.course;

import com.example.grpc.MessageServiceGrpc;
import com.example.grpc.Service;
import io.grpc.stub.StreamObserver;

public class GRPCServiceImpl extends MessageServiceGrpc.MessageServiceImplBase {
    @Override
    public void response(Service.Request request, StreamObserver<Service.Response> responseObserver) {

        System.out.println(request);
        Service.Response response = Service.Response.newBuilder().setResponse("My response" + request.getObject())
                .build();

        responseObserver.onNext(response);

        responseObserver.onCompleted();

    }
}
