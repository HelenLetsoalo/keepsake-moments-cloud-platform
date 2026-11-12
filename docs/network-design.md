# Keepsake Moments Cloud Platform – Network Design

## 1. Purpose

This document describes the proposed AWS network architecture for the Keepsake Moments Cloud Platform.

The objective is to create a secure, organised and scalable network environment.

## 2. Amazon VPC

The proposed VPC IPv4 CIDR block is:

`10.0.0.0/16`

This provides 65,536 total IPv4 addresses within the VPC address range.

The VPC will be divided into smaller subnets to separate public-facing resources, application servers and database resources.

## 3. Subnet Design

The proposed architecture uses six subnets across two Availability Zones.

| Subnet | CIDR block | Purpose |
|---|---|---|
| Public Subnet A | 10.0.1.0/24 | Application Load Balancer |
| Public Subnet B | 10.0.2.0/24 | Application Load Balancer |
| Private App Subnet A | 10.0.11.0/24 | EC2 application servers |
| Private App Subnet B | 10.0.12.0/24 | EC2 application servers |
| Private DB Subnet A | 10.0.21.0/24 | RDS database |
| Private DB Subnet B | 10.0.22.0/24 | RDS database |

Each /24 subnet contains 256 total IPv4 addresses. AWS reserves five addresses in each IPv4 subnet.

## 4. Public Subnets

The public subnets will host the Application Load Balancer.

A public route table will contain a default route:

`0.0.0.0/0`

This route points to the Internet Gateway.

The Load Balancer will receive incoming customer requests and forward them to healthy application servers.

## 5. Private Application Subnets

The private application subnets will host Amazon EC2 application servers.

These servers will process customer requests and communicate with other AWS services.

They will not have direct public internet access.

A NAT Gateway may be considered for outbound internet access when required.

An S3 Gateway VPC Endpoint may be used to provide private access to Amazon S3.

## 6. Private Database Subnets

The private database subnets will be used for the Amazon RDS database subnet group.

The database will not be directly accessible from the public internet.

Database access will be restricted using security groups.

Only authorised application resources should be allowed to communicate with the database on the required database port.

## 7. Network Security

The proposed network security controls include:

- Security Groups to control inbound and outbound traffic.
- Network ACLs to provide subnet-level traffic filtering where required.
- Private subnets to isolate application and database resources.
- IAM permissions to control access to AWS services.
- Database authentication to protect database access.

## 8. Availability and Scalability

The network will span two Availability Zones.

This design allows resources to be distributed across separate Availability Zones to improve resilience.

The application architecture can later incorporate Elastic Load Balancing and EC2 Auto Scaling.

## 9. Project Status

**Current stage:** Network design.

The CIDR ranges and subnet allocations are proposed design choices. They have not yet been deployed as production infrastructure.

