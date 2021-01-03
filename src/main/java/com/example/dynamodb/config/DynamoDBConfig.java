package com.example.dynamodb.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

public class DynamoDBConfig {

  @Bean
  public AmazonDynamoDB amazonDynamoDB(@Value("${aws.access-key}") String accessKey,
                                       @Value("${aws.secret-key}") String secretKey){
    AWSCredentials awsCredentials = new BasicAWSCredentials(accessKey, secretKey);

    AmazonDynamoDB dynamoDB = AmazonDynamoDBClientBuilder.standard().withRegion(Regions.US_EAST_1)
        .withCredentials(new AWSStaticCredentialsProvider((awsCredentials))).build();

    return dynamoDB;
  }
}
