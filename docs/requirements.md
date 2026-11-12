:::writing{variant="document" id="84621"}
# Keepsake Moments Cloud Platform – Requirements

## 1. Project Overview

Keepsake Moments is a fictional personalised gift-box business. This project aims to design and develop a cloud-based platform that allows customers to view products and submit orders online.

The project will use Amazon Web Services (AWS) to explore cloud computing, networking, storage, databases, security, monitoring and scalability.

## 2. Business Problem

Customers need a convenient way to view available gift boxes and place orders.

The business also needs a reliable way to store product images and customer order information.

The platform should be able to support increased customer activity during busy periods without becoming unavailable.

## 3. Business Requirements

The platform should allow:

1. Customers to view available gift boxes.
2. Customers to view product descriptions and prices.
3. Customers to submit gift-box orders.
4. The business owner to view submitted orders.
5. The business to store and manage product images.
6. The platform to support increased customer traffic.

## 4. Technical Requirements

The system should:

1. Provide an online interface accessible through a web browser.
2. Store product images and website files.
3. Store order information in a database.
4. Allow authorised access to administrative functions.
5. Protect stored information from unauthorised access.
6. Monitor system performance and activity.
7. Support scaling when customer demand increases.
8. Include appropriate backup and recovery considerations.

## 5. Proposed AWS Services

| AWS Service | Purpose |
|---|---|
| Amazon S3 | Store website files and product images |
| Amazon EC2 | Run application computing resources |
| Amazon VPC | Provide an isolated network environment |
| Amazon RDS | Store relational business data |
| AWS IAM | Manage permissions and access |
| Amazon CloudWatch | Monitor system performance |

These services are proposed components. They will be introduced and tested as the project develops.

## 6. Non-Functional Requirements

These describe how well the system should operate.

- **Security:** Only authorised users should access protected information.
- **Availability:** Customers should be able to access the platform when it is operational.
- **Scalability:** The system should accommodate increasing customer demand.
- **Performance:** Pages and customer requests should be handled efficiently.
- **Reliability:** The system should consider backups and recovery from failures.

## 7. Project Scope

### Included
- Website hosting.
- Product image storage.
- Customer order submission.
- Database design and storage.
- AWS networking and security.
- Monitoring and scalability.

### Not included in the initial version
- Online card payments.
- Live delivery tracking.
- A mobile application.
- Integration with external courier services.

## 8. Success Criteria

The project will be considered successful when:

1. Customers can view available products.
2. Customers can submit an order.
3. Order information can be stored and retrieved.
4. Product images can be stored and displayed.
5. Access permissions are configured appropriately.
6. The architecture demonstrates how the system can scale.
7. The project includes documentation, diagrams and testing evidence.

## 9. Project Status

**Current stage:** Requirements gathering.

No production infrastructure has been deployed. AWS services will be implemented or simulated progressively as part of this learning project.

:::
