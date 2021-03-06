/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.lightsail;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.auth.*;

import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.internal.auth.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.services.lightsail.AmazonLightsailClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.services.lightsail.model.transform.*;

/**
 * Client for accessing Amazon Lightsail. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * Amazon Lightsail is the easiest way to get started with AWS for developers who just need virtual private servers.
 * Lightsail includes everything you need to launch your project quickly - a virtual machine, SSD-based storage, data
 * transfer, DNS management, and a static IP - for a low, predictable price. You manage those Lightsail servers through
 * the Lightsail console or by using the API or command-line interface (CLI).
 * </p>
 * <p>
 * For more information about Lightsail concepts and tasks, see the <a
 * href="http://lightsail.aws.amazon.com/ls/docs">Lightsail Dev Guide</a>.
 * </p>
 * <p>
 * To use the Lightsail API or the CLI, you will need to use AWS Identity and Access Management (IAM) to generate access
 * keys. For details about how to set this up, see the <a href=
 * "http://lightsail.aws.amazon.com/ls/docs/how-to/articles/lightsail-how-to-set-up-access-keys-to-use-sdk-api-cli"
 * >Lightsail Dev Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonLightsailClient extends AmazonWebServiceClient implements AmazonLightsail {
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonLightsail.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "lightsail";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceException").withModeledClass(
                                    com.amazonaws.services.lightsail.model.ServiceException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotFoundException").withModeledClass(
                                    com.amazonaws.services.lightsail.model.NotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("OperationFailureException").withModeledClass(
                                    com.amazonaws.services.lightsail.model.OperationFailureException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withModeledClass(
                                    com.amazonaws.services.lightsail.model.AccessDeniedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidInputException").withModeledClass(
                                    com.amazonaws.services.lightsail.model.InvalidInputException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccountSetupInProgressException").withModeledClass(
                                    com.amazonaws.services.lightsail.model.AccountSetupInProgressException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnauthenticatedException").withModeledClass(
                                    com.amazonaws.services.lightsail.model.UnauthenticatedException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.lightsail.model.AmazonLightsailException.class));

    /**
     * Constructs a new client to invoke service methods on Amazon Lightsail. A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonLightsailClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonLightsailClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Lightsail. A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Lightsail (ex: proxy
     *        settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     * @deprecated use {@link AmazonLightsailClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonLightsailClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Lightsail using the specified AWS account
     * credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @deprecated use {@link AmazonLightsailClientBuilder#withCredentials(AWSCredentialsProvider)} for example:
     *             {@code AmazonLightsailClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).build();}
     */
    @Deprecated
    public AmazonLightsailClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Lightsail using the specified AWS account credentials
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Lightsail (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonLightsailClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonLightsailClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonLightsailClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Lightsail using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @deprecated use {@link AmazonLightsailClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonLightsailClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Lightsail using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Lightsail (ex: proxy
     *        settings, retry counts, etc.).
     * @deprecated use {@link AmazonLightsailClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonLightsailClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonLightsailClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Lightsail using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Lightsail (ex: proxy
     *        settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     * @deprecated use {@link AmazonLightsailClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonLightsailClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonLightsailClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonLightsailClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    public static AmazonLightsailClientBuilder builder() {
        return AmazonLightsailClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Lightsail using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonLightsailClient(AwsSyncClientParams clientParams) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("lightsail.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/lightsail/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/lightsail/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Allocates a static IP address.
     * </p>
     * 
     * @param allocateStaticIpRequest
     * @return Result of the AllocateStaticIp operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.AllocateStaticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AllocateStaticIp" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AllocateStaticIpResult allocateStaticIp(AllocateStaticIpRequest request) {
        request = beforeClientExecution(request);
        return executeAllocateStaticIp(request);
    }

    @SdkInternalApi
    final AllocateStaticIpResult executeAllocateStaticIp(AllocateStaticIpRequest allocateStaticIpRequest) {

        ExecutionContext executionContext = createExecutionContext(allocateStaticIpRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AllocateStaticIpRequest> request = null;
        Response<AllocateStaticIpResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AllocateStaticIpRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(allocateStaticIpRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AllocateStaticIpResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AllocateStaticIpResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attaches a static IP address to a specific Amazon Lightsail instance.
     * </p>
     * 
     * @param attachStaticIpRequest
     * @return Result of the AttachStaticIp operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.AttachStaticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AttachStaticIp" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public AttachStaticIpResult attachStaticIp(AttachStaticIpRequest request) {
        request = beforeClientExecution(request);
        return executeAttachStaticIp(request);
    }

    @SdkInternalApi
    final AttachStaticIpResult executeAttachStaticIp(AttachStaticIpRequest attachStaticIpRequest) {

        ExecutionContext executionContext = createExecutionContext(attachStaticIpRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachStaticIpRequest> request = null;
        Response<AttachStaticIpResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachStaticIpRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(attachStaticIpRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AttachStaticIpResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new AttachStaticIpResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Closes the public ports on a specific Amazon Lightsail instance.
     * </p>
     * 
     * @param closeInstancePublicPortsRequest
     * @return Result of the CloseInstancePublicPorts operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CloseInstancePublicPorts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CloseInstancePublicPorts"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CloseInstancePublicPortsResult closeInstancePublicPorts(CloseInstancePublicPortsRequest request) {
        request = beforeClientExecution(request);
        return executeCloseInstancePublicPorts(request);
    }

    @SdkInternalApi
    final CloseInstancePublicPortsResult executeCloseInstancePublicPorts(CloseInstancePublicPortsRequest closeInstancePublicPortsRequest) {

        ExecutionContext executionContext = createExecutionContext(closeInstancePublicPortsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CloseInstancePublicPortsRequest> request = null;
        Response<CloseInstancePublicPortsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CloseInstancePublicPortsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(closeInstancePublicPortsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CloseInstancePublicPortsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CloseInstancePublicPortsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a domain resource for the specified domain (e.g., example.com).
     * </p>
     * 
     * @param createDomainRequest
     * @return Result of the CreateDomain operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateDomainResult createDomain(CreateDomainRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDomain(request);
    }

    @SdkInternalApi
    final CreateDomainResult executeCreateDomain(CreateDomainRequest createDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(createDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDomainRequest> request = null;
        Response<CreateDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates one of the following entry records associated with the domain: A record, CNAME record, TXT record, or MX
     * record.
     * </p>
     * 
     * @param createDomainEntryRequest
     * @return Result of the CreateDomainEntry operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateDomainEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateDomainEntry" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateDomainEntryResult createDomainEntry(CreateDomainEntryRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDomainEntry(request);
    }

    @SdkInternalApi
    final CreateDomainEntryResult executeCreateDomainEntry(CreateDomainEntryRequest createDomainEntryRequest) {

        ExecutionContext executionContext = createExecutionContext(createDomainEntryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDomainEntryRequest> request = null;
        Response<CreateDomainEntryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDomainEntryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDomainEntryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDomainEntryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDomainEntryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a snapshot of a specific virtual private server, or <i>instance</i>. You can use a snapshot to create a
     * new instance that is based on that snapshot.
     * </p>
     * 
     * @param createInstanceSnapshotRequest
     * @return Result of the CreateInstanceSnapshot operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateInstanceSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateInstanceSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateInstanceSnapshotResult createInstanceSnapshot(CreateInstanceSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeCreateInstanceSnapshot(request);
    }

    @SdkInternalApi
    final CreateInstanceSnapshotResult executeCreateInstanceSnapshot(CreateInstanceSnapshotRequest createInstanceSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(createInstanceSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateInstanceSnapshotRequest> request = null;
        Response<CreateInstanceSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateInstanceSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createInstanceSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateInstanceSnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateInstanceSnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates one or more Amazon Lightsail virtual private servers, or <i>instances</i>.
     * </p>
     * 
     * @param createInstancesRequest
     * @return Result of the CreateInstances operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateInstances" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateInstancesResult createInstances(CreateInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeCreateInstances(request);
    }

    @SdkInternalApi
    final CreateInstancesResult executeCreateInstances(CreateInstancesRequest createInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(createInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateInstancesRequest> request = null;
        Response<CreateInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateInstancesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateInstancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateInstancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Uses a specific snapshot as a blueprint for creating one or more new instances that are based on that identical
     * configuration.
     * </p>
     * 
     * @param createInstancesFromSnapshotRequest
     * @return Result of the CreateInstancesFromSnapshot operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateInstancesFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateInstancesFromSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateInstancesFromSnapshotResult createInstancesFromSnapshot(CreateInstancesFromSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeCreateInstancesFromSnapshot(request);
    }

    @SdkInternalApi
    final CreateInstancesFromSnapshotResult executeCreateInstancesFromSnapshot(CreateInstancesFromSnapshotRequest createInstancesFromSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(createInstancesFromSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateInstancesFromSnapshotRequest> request = null;
        Response<CreateInstancesFromSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateInstancesFromSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createInstancesFromSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateInstancesFromSnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateInstancesFromSnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates sn SSH key pair.
     * </p>
     * 
     * @param createKeyPairRequest
     * @return Result of the CreateKeyPair operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.CreateKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateKeyPairResult createKeyPair(CreateKeyPairRequest request) {
        request = beforeClientExecution(request);
        return executeCreateKeyPair(request);
    }

    @SdkInternalApi
    final CreateKeyPairResult executeCreateKeyPair(CreateKeyPairRequest createKeyPairRequest) {

        ExecutionContext executionContext = createExecutionContext(createKeyPairRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateKeyPairRequest> request = null;
        Response<CreateKeyPairResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateKeyPairRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createKeyPairRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateKeyPairResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateKeyPairResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified domain recordset and all of its domain records.
     * </p>
     * 
     * @param deleteDomainRequest
     * @return Result of the DeleteDomain operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteDomain" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteDomainResult deleteDomain(DeleteDomainRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDomain(request);
    }

    @SdkInternalApi
    final DeleteDomainResult executeDeleteDomain(DeleteDomainRequest deleteDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDomainRequest> request = null;
        Response<DeleteDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDomainResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specific domain entry.
     * </p>
     * 
     * @param deleteDomainEntryRequest
     * @return Result of the DeleteDomainEntry operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteDomainEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteDomainEntry" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteDomainEntryResult deleteDomainEntry(DeleteDomainEntryRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDomainEntry(request);
    }

    @SdkInternalApi
    final DeleteDomainEntryResult executeDeleteDomainEntry(DeleteDomainEntryRequest deleteDomainEntryRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDomainEntryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDomainEntryRequest> request = null;
        Response<DeleteDomainEntryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDomainEntryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDomainEntryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDomainEntryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDomainEntryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specific Amazon Lightsail virtual private server, or <i>instance</i>.
     * </p>
     * 
     * @param deleteInstanceRequest
     * @return Result of the DeleteInstance operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteInstance" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteInstanceResult deleteInstance(DeleteInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteInstance(request);
    }

    @SdkInternalApi
    final DeleteInstanceResult executeDeleteInstance(DeleteInstanceRequest deleteInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteInstanceRequest> request = null;
        Response<DeleteInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specific snapshot of a virtual private server (or <i>instance</i>).
     * </p>
     * 
     * @param deleteInstanceSnapshotRequest
     * @return Result of the DeleteInstanceSnapshot operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteInstanceSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteInstanceSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteInstanceSnapshotResult deleteInstanceSnapshot(DeleteInstanceSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteInstanceSnapshot(request);
    }

    @SdkInternalApi
    final DeleteInstanceSnapshotResult executeDeleteInstanceSnapshot(DeleteInstanceSnapshotRequest deleteInstanceSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteInstanceSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteInstanceSnapshotRequest> request = null;
        Response<DeleteInstanceSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteInstanceSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteInstanceSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteInstanceSnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteInstanceSnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specific SSH key pair.
     * </p>
     * 
     * @param deleteKeyPairRequest
     * @return Result of the DeleteKeyPair operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DeleteKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteKeyPairResult deleteKeyPair(DeleteKeyPairRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteKeyPair(request);
    }

    @SdkInternalApi
    final DeleteKeyPairResult executeDeleteKeyPair(DeleteKeyPairRequest deleteKeyPairRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteKeyPairRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteKeyPairRequest> request = null;
        Response<DeleteKeyPairResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteKeyPairRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteKeyPairRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteKeyPairResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteKeyPairResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Detaches a static IP from the Amazon Lightsail instance to which it is attached.
     * </p>
     * 
     * @param detachStaticIpRequest
     * @return Result of the DetachStaticIp operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DetachStaticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DetachStaticIp" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DetachStaticIpResult detachStaticIp(DetachStaticIpRequest request) {
        request = beforeClientExecution(request);
        return executeDetachStaticIp(request);
    }

    @SdkInternalApi
    final DetachStaticIpResult executeDetachStaticIp(DetachStaticIpRequest detachStaticIpRequest) {

        ExecutionContext executionContext = createExecutionContext(detachStaticIpRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetachStaticIpRequest> request = null;
        Response<DetachStaticIpResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetachStaticIpRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(detachStaticIpRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DetachStaticIpResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DetachStaticIpResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Downloads the default SSH key pair from the user's account.
     * </p>
     * 
     * @param downloadDefaultKeyPairRequest
     * @return Result of the DownloadDefaultKeyPair operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.DownloadDefaultKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DownloadDefaultKeyPair"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DownloadDefaultKeyPairResult downloadDefaultKeyPair(DownloadDefaultKeyPairRequest request) {
        request = beforeClientExecution(request);
        return executeDownloadDefaultKeyPair(request);
    }

    @SdkInternalApi
    final DownloadDefaultKeyPairResult executeDownloadDefaultKeyPair(DownloadDefaultKeyPairRequest downloadDefaultKeyPairRequest) {

        ExecutionContext executionContext = createExecutionContext(downloadDefaultKeyPairRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DownloadDefaultKeyPairRequest> request = null;
        Response<DownloadDefaultKeyPairResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DownloadDefaultKeyPairRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(downloadDefaultKeyPairRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DownloadDefaultKeyPairResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DownloadDefaultKeyPairResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the names of all active (not deleted) resources.
     * </p>
     * 
     * @param getActiveNamesRequest
     * @return Result of the GetActiveNames operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetActiveNames
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetActiveNames" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetActiveNamesResult getActiveNames(GetActiveNamesRequest request) {
        request = beforeClientExecution(request);
        return executeGetActiveNames(request);
    }

    @SdkInternalApi
    final GetActiveNamesResult executeGetActiveNames(GetActiveNamesRequest getActiveNamesRequest) {

        ExecutionContext executionContext = createExecutionContext(getActiveNamesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetActiveNamesRequest> request = null;
        Response<GetActiveNamesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetActiveNamesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getActiveNamesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetActiveNamesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetActiveNamesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the list of available instance images, or <i>blueprints</i>. You can use a blueprint to create a new
     * virtual private server already running a specific operating system, as well as a preinstalled app or development
     * stack. The software each instance is running depends on the blueprint image you choose.
     * </p>
     * 
     * @param getBlueprintsRequest
     * @return Result of the GetBlueprints operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetBlueprints
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetBlueprints" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetBlueprintsResult getBlueprints(GetBlueprintsRequest request) {
        request = beforeClientExecution(request);
        return executeGetBlueprints(request);
    }

    @SdkInternalApi
    final GetBlueprintsResult executeGetBlueprints(GetBlueprintsRequest getBlueprintsRequest) {

        ExecutionContext executionContext = createExecutionContext(getBlueprintsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBlueprintsRequest> request = null;
        Response<GetBlueprintsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBlueprintsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBlueprintsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBlueprintsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetBlueprintsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the list of bundles that are available for purchase. A bundle describes the specs for your virtual
     * private server (or <i>instance</i>).
     * </p>
     * 
     * @param getBundlesRequest
     * @return Result of the GetBundles operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetBundles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetBundles" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetBundlesResult getBundles(GetBundlesRequest request) {
        request = beforeClientExecution(request);
        return executeGetBundles(request);
    }

    @SdkInternalApi
    final GetBundlesResult executeGetBundles(GetBundlesRequest getBundlesRequest) {

        ExecutionContext executionContext = createExecutionContext(getBundlesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBundlesRequest> request = null;
        Response<GetBundlesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBundlesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getBundlesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetBundlesResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetBundlesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a specific domain recordset.
     * </p>
     * 
     * @param getDomainRequest
     * @return Result of the GetDomain operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDomain" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDomainResult getDomain(GetDomainRequest request) {
        request = beforeClientExecution(request);
        return executeGetDomain(request);
    }

    @SdkInternalApi
    final GetDomainResult executeGetDomain(GetDomainRequest getDomainRequest) {

        ExecutionContext executionContext = createExecutionContext(getDomainRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDomainRequest> request = null;
        Response<GetDomainResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDomainRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDomainRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDomainResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDomainResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all domains in the user's account.
     * </p>
     * 
     * @param getDomainsRequest
     * @return Result of the GetDomains operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDomains" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetDomainsResult getDomains(GetDomainsRequest request) {
        request = beforeClientExecution(request);
        return executeGetDomains(request);
    }

    @SdkInternalApi
    final GetDomainsResult executeGetDomains(GetDomainsRequest getDomainsRequest) {

        ExecutionContext executionContext = createExecutionContext(getDomainsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDomainsRequest> request = null;
        Response<GetDomainsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDomainsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getDomainsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetDomainsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetDomainsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a specific Amazon Lightsail instance, which is a virtual private server.
     * </p>
     * 
     * @param getInstanceRequest
     * @return Result of the GetInstance operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstance" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetInstanceResult getInstance(GetInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeGetInstance(request);
    }

    @SdkInternalApi
    final GetInstanceResult executeGetInstance(GetInstanceRequest getInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(getInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInstanceRequest> request = null;
        Response<GetInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns temporary SSH keys you can use to connect to a specific virtual private server, or <i>instance</i>.
     * </p>
     * 
     * @param getInstanceAccessDetailsRequest
     * @return Result of the GetInstanceAccessDetails operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetInstanceAccessDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstanceAccessDetails"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetInstanceAccessDetailsResult getInstanceAccessDetails(GetInstanceAccessDetailsRequest request) {
        request = beforeClientExecution(request);
        return executeGetInstanceAccessDetails(request);
    }

    @SdkInternalApi
    final GetInstanceAccessDetailsResult executeGetInstanceAccessDetails(GetInstanceAccessDetailsRequest getInstanceAccessDetailsRequest) {

        ExecutionContext executionContext = createExecutionContext(getInstanceAccessDetailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInstanceAccessDetailsRequest> request = null;
        Response<GetInstanceAccessDetailsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInstanceAccessDetailsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getInstanceAccessDetailsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetInstanceAccessDetailsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetInstanceAccessDetailsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the data points for the specified Amazon Lightsail instance metric, given an instance name.
     * </p>
     * 
     * @param getInstanceMetricDataRequest
     * @return Result of the GetInstanceMetricData operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetInstanceMetricData
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstanceMetricData"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetInstanceMetricDataResult getInstanceMetricData(GetInstanceMetricDataRequest request) {
        request = beforeClientExecution(request);
        return executeGetInstanceMetricData(request);
    }

    @SdkInternalApi
    final GetInstanceMetricDataResult executeGetInstanceMetricData(GetInstanceMetricDataRequest getInstanceMetricDataRequest) {

        ExecutionContext executionContext = createExecutionContext(getInstanceMetricDataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInstanceMetricDataRequest> request = null;
        Response<GetInstanceMetricDataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInstanceMetricDataRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getInstanceMetricDataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetInstanceMetricDataResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetInstanceMetricDataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the port states for a specific virtual private server, or <i>instance</i>.
     * </p>
     * 
     * @param getInstancePortStatesRequest
     * @return Result of the GetInstancePortStates operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetInstancePortStates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstancePortStates"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetInstancePortStatesResult getInstancePortStates(GetInstancePortStatesRequest request) {
        request = beforeClientExecution(request);
        return executeGetInstancePortStates(request);
    }

    @SdkInternalApi
    final GetInstancePortStatesResult executeGetInstancePortStates(GetInstancePortStatesRequest getInstancePortStatesRequest) {

        ExecutionContext executionContext = createExecutionContext(getInstancePortStatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInstancePortStatesRequest> request = null;
        Response<GetInstancePortStatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInstancePortStatesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getInstancePortStatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetInstancePortStatesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new GetInstancePortStatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a specific instance snapshot.
     * </p>
     * 
     * @param getInstanceSnapshotRequest
     * @return Result of the GetInstanceSnapshot operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetInstanceSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstanceSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetInstanceSnapshotResult getInstanceSnapshot(GetInstanceSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeGetInstanceSnapshot(request);
    }

    @SdkInternalApi
    final GetInstanceSnapshotResult executeGetInstanceSnapshot(GetInstanceSnapshotRequest getInstanceSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(getInstanceSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInstanceSnapshotRequest> request = null;
        Response<GetInstanceSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInstanceSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getInstanceSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetInstanceSnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetInstanceSnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns all instance snapshots for the user's account.
     * </p>
     * 
     * @param getInstanceSnapshotsRequest
     * @return Result of the GetInstanceSnapshots operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetInstanceSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstanceSnapshots" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetInstanceSnapshotsResult getInstanceSnapshots(GetInstanceSnapshotsRequest request) {
        request = beforeClientExecution(request);
        return executeGetInstanceSnapshots(request);
    }

    @SdkInternalApi
    final GetInstanceSnapshotsResult executeGetInstanceSnapshots(GetInstanceSnapshotsRequest getInstanceSnapshotsRequest) {

        ExecutionContext executionContext = createExecutionContext(getInstanceSnapshotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInstanceSnapshotsRequest> request = null;
        Response<GetInstanceSnapshotsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInstanceSnapshotsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getInstanceSnapshotsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetInstanceSnapshotsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetInstanceSnapshotsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the state of a specific instance. Works on one instance at a time.
     * </p>
     * 
     * @param getInstanceStateRequest
     * @return Result of the GetInstanceState operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetInstanceState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstanceState" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetInstanceStateResult getInstanceState(GetInstanceStateRequest request) {
        request = beforeClientExecution(request);
        return executeGetInstanceState(request);
    }

    @SdkInternalApi
    final GetInstanceStateResult executeGetInstanceState(GetInstanceStateRequest getInstanceStateRequest) {

        ExecutionContext executionContext = createExecutionContext(getInstanceStateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInstanceStateRequest> request = null;
        Response<GetInstanceStateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInstanceStateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getInstanceStateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetInstanceStateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetInstanceStateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about all Amazon Lightsail virtual private servers, or <i>instances</i>.
     * </p>
     * 
     * @param getInstancesRequest
     * @return Result of the GetInstances operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstances" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetInstancesResult getInstances(GetInstancesRequest request) {
        request = beforeClientExecution(request);
        return executeGetInstances(request);
    }

    @SdkInternalApi
    final GetInstancesResult executeGetInstances(GetInstancesRequest getInstancesRequest) {

        ExecutionContext executionContext = createExecutionContext(getInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetInstancesRequest> request = null;
        Response<GetInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetInstancesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetInstancesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetInstancesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a specific key pair.
     * </p>
     * 
     * @param getKeyPairRequest
     * @return Result of the GetKeyPair operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetKeyPairResult getKeyPair(GetKeyPairRequest request) {
        request = beforeClientExecution(request);
        return executeGetKeyPair(request);
    }

    @SdkInternalApi
    final GetKeyPairResult executeGetKeyPair(GetKeyPairRequest getKeyPairRequest) {

        ExecutionContext executionContext = createExecutionContext(getKeyPairRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetKeyPairRequest> request = null;
        Response<GetKeyPairResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetKeyPairRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getKeyPairRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetKeyPairResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetKeyPairResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about all key pairs in the user's account.
     * </p>
     * 
     * @param getKeyPairsRequest
     * @return Result of the GetKeyPairs operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetKeyPairs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetKeyPairs" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetKeyPairsResult getKeyPairs(GetKeyPairsRequest request) {
        request = beforeClientExecution(request);
        return executeGetKeyPairs(request);
    }

    @SdkInternalApi
    final GetKeyPairsResult executeGetKeyPairs(GetKeyPairsRequest getKeyPairsRequest) {

        ExecutionContext executionContext = createExecutionContext(getKeyPairsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetKeyPairsRequest> request = null;
        Response<GetKeyPairsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetKeyPairsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getKeyPairsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetKeyPairsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetKeyPairsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a specific operation. Operations include events such as when you create an instance,
     * allocate a static IP, attach a static IP, and so on.
     * </p>
     * 
     * @param getOperationRequest
     * @return Result of the GetOperation operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetOperation" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetOperationResult getOperation(GetOperationRequest request) {
        request = beforeClientExecution(request);
        return executeGetOperation(request);
    }

    @SdkInternalApi
    final GetOperationResult executeGetOperation(GetOperationRequest getOperationRequest) {

        ExecutionContext executionContext = createExecutionContext(getOperationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOperationRequest> request = null;
        Response<GetOperationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOperationRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getOperationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetOperationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetOperationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about all operations.
     * </p>
     * <p>
     * Results are returned from oldest to newest, up to a maximum of 200. Results can be paged by making each
     * subsequent call to <code>GetOperations</code> use the maximum (last) <code>statusChangedAt</code> value from the
     * previous request.
     * </p>
     * 
     * @param getOperationsRequest
     * @return Result of the GetOperations operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetOperations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetOperations" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetOperationsResult getOperations(GetOperationsRequest request) {
        request = beforeClientExecution(request);
        return executeGetOperations(request);
    }

    @SdkInternalApi
    final GetOperationsResult executeGetOperations(GetOperationsRequest getOperationsRequest) {

        ExecutionContext executionContext = createExecutionContext(getOperationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOperationsRequest> request = null;
        Response<GetOperationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOperationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getOperationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetOperationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetOperationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets operations for a specific resource (e.g., an instance or a static IP).
     * </p>
     * 
     * @param getOperationsForResourceRequest
     * @return Result of the GetOperationsForResource operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetOperationsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetOperationsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetOperationsForResourceResult getOperationsForResource(GetOperationsForResourceRequest request) {
        request = beforeClientExecution(request);
        return executeGetOperationsForResource(request);
    }

    @SdkInternalApi
    final GetOperationsForResourceResult executeGetOperationsForResource(GetOperationsForResourceRequest getOperationsForResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(getOperationsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetOperationsForResourceRequest> request = null;
        Response<GetOperationsForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetOperationsForResourceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(getOperationsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetOperationsForResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new GetOperationsForResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of all valid regions for Amazon Lightsail.
     * </p>
     * 
     * @param getRegionsRequest
     * @return Result of the GetRegions operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetRegions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetRegions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetRegionsResult getRegions(GetRegionsRequest request) {
        request = beforeClientExecution(request);
        return executeGetRegions(request);
    }

    @SdkInternalApi
    final GetRegionsResult executeGetRegions(GetRegionsRequest getRegionsRequest) {

        ExecutionContext executionContext = createExecutionContext(getRegionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRegionsRequest> request = null;
        Response<GetRegionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRegionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getRegionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetRegionsResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetRegionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about a specific static IP.
     * </p>
     * 
     * @param getStaticIpRequest
     * @return Result of the GetStaticIp operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetStaticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetStaticIp" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetStaticIpResult getStaticIp(GetStaticIpRequest request) {
        request = beforeClientExecution(request);
        return executeGetStaticIp(request);
    }

    @SdkInternalApi
    final GetStaticIpResult executeGetStaticIp(GetStaticIpRequest getStaticIpRequest) {

        ExecutionContext executionContext = createExecutionContext(getStaticIpRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetStaticIpRequest> request = null;
        Response<GetStaticIpResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetStaticIpRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getStaticIpRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetStaticIpResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetStaticIpResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about all static IPs in the user's account.
     * </p>
     * 
     * @param getStaticIpsRequest
     * @return Result of the GetStaticIps operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.GetStaticIps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetStaticIps" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public GetStaticIpsResult getStaticIps(GetStaticIpsRequest request) {
        request = beforeClientExecution(request);
        return executeGetStaticIps(request);
    }

    @SdkInternalApi
    final GetStaticIpsResult executeGetStaticIps(GetStaticIpsRequest getStaticIpsRequest) {

        ExecutionContext executionContext = createExecutionContext(getStaticIpsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetStaticIpsRequest> request = null;
        Response<GetStaticIpsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetStaticIpsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getStaticIpsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetStaticIpsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetStaticIpsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Imports a public SSH key from a specific key pair.
     * </p>
     * 
     * @param importKeyPairRequest
     * @return Result of the ImportKeyPair operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.ImportKeyPair
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/ImportKeyPair" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ImportKeyPairResult importKeyPair(ImportKeyPairRequest request) {
        request = beforeClientExecution(request);
        return executeImportKeyPair(request);
    }

    @SdkInternalApi
    final ImportKeyPairResult executeImportKeyPair(ImportKeyPairRequest importKeyPairRequest) {

        ExecutionContext executionContext = createExecutionContext(importKeyPairRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportKeyPairRequest> request = null;
        Response<ImportKeyPairResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportKeyPairRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(importKeyPairRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ImportKeyPairResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ImportKeyPairResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a Boolean value indicating whether your Lightsail VPC is peered.
     * </p>
     * 
     * @param isVpcPeeredRequest
     * @return Result of the IsVpcPeered operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.IsVpcPeered
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/IsVpcPeered" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public IsVpcPeeredResult isVpcPeered(IsVpcPeeredRequest request) {
        request = beforeClientExecution(request);
        return executeIsVpcPeered(request);
    }

    @SdkInternalApi
    final IsVpcPeeredResult executeIsVpcPeered(IsVpcPeeredRequest isVpcPeeredRequest) {

        ExecutionContext executionContext = createExecutionContext(isVpcPeeredRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<IsVpcPeeredRequest> request = null;
        Response<IsVpcPeeredResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new IsVpcPeeredRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(isVpcPeeredRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<IsVpcPeeredResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new IsVpcPeeredResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds public ports to an Amazon Lightsail instance.
     * </p>
     * 
     * @param openInstancePublicPortsRequest
     * @return Result of the OpenInstancePublicPorts operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.OpenInstancePublicPorts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/OpenInstancePublicPorts"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public OpenInstancePublicPortsResult openInstancePublicPorts(OpenInstancePublicPortsRequest request) {
        request = beforeClientExecution(request);
        return executeOpenInstancePublicPorts(request);
    }

    @SdkInternalApi
    final OpenInstancePublicPortsResult executeOpenInstancePublicPorts(OpenInstancePublicPortsRequest openInstancePublicPortsRequest) {

        ExecutionContext executionContext = createExecutionContext(openInstancePublicPortsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<OpenInstancePublicPortsRequest> request = null;
        Response<OpenInstancePublicPortsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new OpenInstancePublicPortsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(openInstancePublicPortsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<OpenInstancePublicPortsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new OpenInstancePublicPortsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Tries to peer the Lightsail VPC with the user's default VPC.
     * </p>
     * 
     * @param peerVpcRequest
     * @return Result of the PeerVpc operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.PeerVpc
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/PeerVpc" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public PeerVpcResult peerVpc(PeerVpcRequest request) {
        request = beforeClientExecution(request);
        return executePeerVpc(request);
    }

    @SdkInternalApi
    final PeerVpcResult executePeerVpc(PeerVpcRequest peerVpcRequest) {

        ExecutionContext executionContext = createExecutionContext(peerVpcRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PeerVpcRequest> request = null;
        Response<PeerVpcResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PeerVpcRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(peerVpcRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PeerVpcResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new PeerVpcResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Restarts a specific instance. When your Amazon Lightsail instance is finished rebooting, Lightsail assigns a new
     * public IP address. To use the same IP address after restarting, create a static IP address and attach it to the
     * instance.
     * </p>
     * 
     * @param rebootInstanceRequest
     * @return Result of the RebootInstance operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.RebootInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/RebootInstance" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public RebootInstanceResult rebootInstance(RebootInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeRebootInstance(request);
    }

    @SdkInternalApi
    final RebootInstanceResult executeRebootInstance(RebootInstanceRequest rebootInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(rebootInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RebootInstanceRequest> request = null;
        Response<RebootInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RebootInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(rebootInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RebootInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new RebootInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a specific static IP from your account.
     * </p>
     * 
     * @param releaseStaticIpRequest
     * @return Result of the ReleaseStaticIp operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.ReleaseStaticIp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/ReleaseStaticIp" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ReleaseStaticIpResult releaseStaticIp(ReleaseStaticIpRequest request) {
        request = beforeClientExecution(request);
        return executeReleaseStaticIp(request);
    }

    @SdkInternalApi
    final ReleaseStaticIpResult executeReleaseStaticIp(ReleaseStaticIpRequest releaseStaticIpRequest) {

        ExecutionContext executionContext = createExecutionContext(releaseStaticIpRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ReleaseStaticIpRequest> request = null;
        Response<ReleaseStaticIpResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ReleaseStaticIpRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(releaseStaticIpRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ReleaseStaticIpResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ReleaseStaticIpResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts a specific Amazon Lightsail instance from a stopped state. To restart an instance, use the reboot instance
     * operation.
     * </p>
     * 
     * @param startInstanceRequest
     * @return Result of the StartInstance operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.StartInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/StartInstance" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StartInstanceResult startInstance(StartInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeStartInstance(request);
    }

    @SdkInternalApi
    final StartInstanceResult executeStartInstance(StartInstanceRequest startInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(startInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartInstanceRequest> request = null;
        Response<StartInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(startInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a specific Amazon Lightsail instance that is currently running.
     * </p>
     * 
     * @param stopInstanceRequest
     * @return Result of the StopInstance operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.StopInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/StopInstance" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopInstanceResult stopInstance(StopInstanceRequest request) {
        request = beforeClientExecution(request);
        return executeStopInstance(request);
    }

    @SdkInternalApi
    final StopInstanceResult executeStopInstance(StopInstanceRequest stopInstanceRequest) {

        ExecutionContext executionContext = createExecutionContext(stopInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopInstanceRequest> request = null;
        Response<StopInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopInstanceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopInstanceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopInstanceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attempts to unpeer the Lightsail VPC from the user's default VPC.
     * </p>
     * 
     * @param unpeerVpcRequest
     * @return Result of the UnpeerVpc operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.UnpeerVpc
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UnpeerVpc" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UnpeerVpcResult unpeerVpc(UnpeerVpcRequest request) {
        request = beforeClientExecution(request);
        return executeUnpeerVpc(request);
    }

    @SdkInternalApi
    final UnpeerVpcResult executeUnpeerVpc(UnpeerVpcRequest unpeerVpcRequest) {

        ExecutionContext executionContext = createExecutionContext(unpeerVpcRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UnpeerVpcRequest> request = null;
        Response<UnpeerVpcResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UnpeerVpcRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(unpeerVpcRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UnpeerVpcResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new UnpeerVpcResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a domain recordset after it is created.
     * </p>
     * 
     * @param updateDomainEntryRequest
     * @return Result of the UpdateDomainEntry operation returned by the service.
     * @throws ServiceException
     *         A general service exception.
     * @throws InvalidInputException
     *         Lightsail throws this exception when user input does not conform to the validation rules of an input
     *         field.
     * @throws NotFoundException
     *         Lightsail throws this exception when it cannot find a resource.
     * @throws OperationFailureException
     *         Lightsail throws this exception when an operation fails to execute.
     * @throws AccessDeniedException
     *         Lightsail throws this exception when the user cannot be authenticated or uses invalid credentials to
     *         access a resource.
     * @throws AccountSetupInProgressException
     *         Lightsail throws this exception when an account is still in the setup in progress state.
     * @throws UnauthenticatedException
     *         Lightsail throws this exception when the user has not been authenticated.
     * @sample AmazonLightsail.UpdateDomainEntry
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/UpdateDomainEntry" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateDomainEntryResult updateDomainEntry(UpdateDomainEntryRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDomainEntry(request);
    }

    @SdkInternalApi
    final UpdateDomainEntryResult executeUpdateDomainEntry(UpdateDomainEntryRequest updateDomainEntryRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDomainEntryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDomainEntryRequest> request = null;
        Response<UpdateDomainEntryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDomainEntryRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDomainEntryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDomainEntryResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDomainEntryResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

}
