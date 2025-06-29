package ru.education.spring.course;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(8081)
                .addService(new GRPCServiceImpl()).build();

        server.start();

        System.out.println("Server started");

        server.awaitTermination();
    }
}