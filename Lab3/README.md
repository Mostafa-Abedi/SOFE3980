# Lab 3: SOFTWARE QUALITY
Ontario Tech University
Deploying w/ Google Kubernetes Engine
CRN 73385 | SECTION 001

Date: March 1st, 2024

Mostafa Abedi (100787034)
mostafa.abedi@ontariotechu.net

## Table of Contents
- [Introduction](#introduction)
- [Learning Objectives](#learning-objectives)
- [Docker](#docker)
  - [What is Docker?](#what-is-docker)
  - [Terminologies](#terminologies)
- [Kubernetes](#kubernetes)
  - [What is Kubernetes?](#what-is-kubernetes)
  - [Terminologies](#terminologies-1)
- [Links](#links)
  - [Github](#github)
  - [YAML](#yaml)
  - [MySQL](#mysql)
- [Conclusion](#conclusion)

## Lab 3

## Introduction
A brief description of the lab assignment
This lab assignment tasks us with deploying a web application using Docker containers orchestrated by Kubernetes on GCP's Google Kubernetes Engine (GKE). Through a series of structured exercises, we aim to achieve a comprehensive understanding of Docker and Kubernetes, from containerizing applications to managing their deployment and scaling.

## Learning Objectives
Our goals for this lab assignment:

1. Get familiar with Docker and Kubernetes.
2. Use Google Cloud Platform.
3. Deploy Maven WebApp over Google Kubernetes Engine (GKE).

## Docker
### What is Docker?
Docker is a software tool designed to simplify the process of deploying applications by packaging them into lightweight containers. These containers ensure that applications can run smoothly and efficiently across different environments. Docker provides the suitable framework for each different application since every application has a framework with a suitable version. This space also can be utilized for a new software application, along with its required framework. As a result, docker makes more efficient use of system resources.


### Terminologies
There are different terminologies used in docker here are a few examples:
1. **Container**: A lightweight, standalone, executable package that includes everything needed to run a piece of software, including the code, runtime, libraries, environment variables, and system tools. A container is a runtime instance of a docker image.
   - A Docker container consists of
     - A Docker image
     - An execution environment
     - A standard set of instructions
   The concept is borrowed from shipping containers, which define a standard to ship goods globally. Docker defines a standard to ship software.
2. **Image**: A read-only template that contains the instructions for creating a container. Images are the basis of containers, and they typically include the operating system, application code, libraries, and dependencies. Docker images are the basis of containers. An Image is an ordered collection of root filesystem changes and the corresponding execution parameters for use within a container runtime. An image typically contains a union of layered filesystems stacked on top of each other. An image does not have state and it never changes.
3. **Registry**: A storage and distribution service for Docker images. The Docker Hub is the default public registry, but you can also set up private registries to store and share custom images within your organization. Registry is a hosted service containing repositories of images which responds to the Registry API. The default registry can be accessed using a browser at Docker Hub or using the docker search command.

## Kubernetes
### What is Kubernetes?
Kubernetes serves as a versatile, customizable, and freely accessible framework designed to handle container-based tasks and services. It enables streamlined configuration processes and automated operations, allowing for the robust management of distributed systems with features like scalability and resilience to application failures. In essence, it functions as a container orchestrator, ensuring proper container placement and facilitating seamless collaboration among containers.

### Terminologies
Kubernetes has many terminologies, here are a few of them described:
1. **Cluster**: A Kubernetes cluster is a set of nodes (physical or virtual machines) that are grouped together to run containerized applications. It consists of a control plane, which manages the cluster, and one or more worker nodes, where the actual application containers run. The control plane coordinates all activities in the cluster and maintains the desired state of the system.
2. **Pod**: A pod is the smallest deployable unit in Kubernetes. It represents one or more containers that are tightly coupled and share resources, such as networking and storage, and can be scheduled together on the same node. Pods are the basic building blocks of Kubernetes applications and are designed to be ephemeral, meaning they can be easily created, destroyed, and replaced as needed.
3. **Deployment**: A Deployment in Kubernetes is a resource object that manages the lifecycle of replica sets and pods. It allows you to declaratively define the desired state of your application, including the number of replicas (copies) of your pods, the container image version, and how updates to the application should be rolled out. Deployments ensure that the specified number of pod replicas are running at all times and handle scaling, rolling updates, and rollback operations automatically.
4. **Service**: A Service in Kubernetes is an abstraction that defines a logical set of pods and a policy by which to access them. It provides a stable endpoint (IP address and port) for accessing one or more pods, regardless of their individual IP addresses or whether they are running on the same node or different nodes. Services enable communication between different parts of an application or between different applications within the cluster, and they can be of different types, such as ClusterIP, NodePort, and LoadBalancer, depending on how they expose the pods to the outside world or other services within the cluster.

## Links

### YAML Video
The video describing the process of creating the deployment and service using YAML files can be found [here](https://github.com/Mostafa-Abedi/SOFE3980.git).

### MySQL Video
The code from each tutorial can be found [here](https://github.com/Mostafa-Abedi/SOFE3980.git).

## Conclusion
A summary of the lab assignment
In conclusion, we embarked on a journey to master the deployment of web applications using Docker and Kubernetes on Google Cloud Platform (GCP). Through hands-on practice, we gained a deep understanding of Docker and Kubernetes, from fundamental concepts to practical deployment scenarios. The deployment of a Maven-based web application on GKE served as the focal point of our learning, where we navigated challenges such as configuration, troubleshooting, and optimization. This experience equipped us with technical expertise and instilled in us a sense of curiosity and resilience essential for mastering cloud-native development and deployment. Armed with this knowledge, we are prepared to tackle future challenges and opportunities in the realm of cloud computing.
