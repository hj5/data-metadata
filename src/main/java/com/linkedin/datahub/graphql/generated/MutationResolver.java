package com.linkedin.datahub.graphql.generated;


/**
 * Root type used for updating DataHub Metadata
Coming soon createEntity, addOwner, removeOwner mutations
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface MutationResolver {

    /**
     * Update the metadata about a particular Dataset
     */
    Dataset updateDataset(String urn, DatasetUpdateInput input) throws Exception;

    /**
     * Update the metadata about a particular Chart
     */
    Chart updateChart(String urn, ChartUpdateInput input) throws Exception;

    /**
     * Update the metadata about a particular Dashboard
     */
    Dashboard updateDashboard(String urn, DashboardUpdateInput input) throws Exception;

    /**
     * Update the metadata about a particular Notebook
     */
    Notebook updateNotebook(String urn, NotebookUpdateInput input) throws Exception;

    /**
     * Update the metadata about a particular Data Flow (Pipeline)
     */
    DataFlow updateDataFlow(String urn, DataFlowUpdateInput input) throws Exception;

    /**
     * Update the metadata about a particular Data Job (Task)
     */
    DataJob updateDataJob(String urn, DataJobUpdateInput input) throws Exception;

    /**
     * Create a new tag. Requires the 'Manage Tags' or 'Create Tags' Platform Privilege. If a Tag with the provided ID already exists,
it will be overwritten.
     */
    String createTag(CreateTagInput input) throws Exception;

    /**
     * Update the information about a particular Entity Tag
     */
    Tag updateTag(String urn, TagUpdateInput input) throws Exception;

    /**
     * Delete a Tag
     */
    Boolean deleteTag(String urn) throws Exception;

    /**
     * Set the hex color associated with an existing Tag
     */
    Boolean setTagColor(String urn, String colorHex) throws Exception;

    /**
     * Create a policy and returns the resulting urn
     */
    String createPolicy(PolicyUpdateInput input) throws Exception;

    /**
     * Update an existing policy and returns the resulting urn
     */
    String updatePolicy(String urn, PolicyUpdateInput input) throws Exception;

    /**
     * Remove an existing policy and returns the policy urn
     */
    String deletePolicy(String urn) throws Exception;

    /**
     * Add a tag to a particular Entity or subresource
     */
    Boolean addTag(TagAssociationInput input) throws Exception;

    /**
     * Add multiple tags to a particular Entity or subresource
     */
    Boolean addTags(AddTagsInput input) throws Exception;

    /**
     * Remove a tag from a particular Entity or subresource
     */
    Boolean removeTag(TagAssociationInput input) throws Exception;

    /**
     * Add a glossary term to a particular Entity or subresource
     */
    Boolean addTerm(TermAssociationInput input) throws Exception;

    /**
     * Add multiple glossary terms to a particular Entity or subresource
     */
    Boolean addTerms(AddTermsInput input) throws Exception;

    /**
     * Remove a glossary term from a particular Entity or subresource
     */
    Boolean removeTerm(TermAssociationInput input) throws Exception;

    /**
     * Add an owner to a particular Entity
     */
    Boolean addOwner(AddOwnerInput input) throws Exception;

    /**
     * Add multiple owners to a particular Entity
     */
    Boolean addOwners(AddOwnersInput input) throws Exception;

    /**
     * Remove an owner from a particular Entity
     */
    Boolean removeOwner(RemoveOwnerInput input) throws Exception;

    /**
     * Add a link, or institutional memory, from a particular Entity
     */
    Boolean addLink(AddLinkInput input) throws Exception;

    /**
     * Remove a link, or institutional memory, from a particular Entity
     */
    Boolean removeLink(RemoveLinkInput input) throws Exception;

    /**
     * Incubating. Updates the description of a resource. Currently only supports Dataset Schema Fields, Containers
     */
    Boolean updateDescription(DescriptionUpdateInput input) throws Exception;

    /**
     * Remove a user. Requires Manage Users & Groups Platform Privilege
     */
    Boolean removeUser(String urn) throws Exception;

    /**
     * Change the status of a user. Requires Manage Users & Groups Platform Privilege
     */
    String updateUserStatus(String urn, CorpUserStatus status) throws Exception;

    /**
     * Remove a group. Requires Manage Users & Groups Platform Privilege
     */
    Boolean removeGroup(String urn) throws Exception;

    /**
     * Add members to a group
     */
    Boolean addGroupMembers(AddGroupMembersInput input) throws Exception;

    /**
     * Remove members from a group
     */
    Boolean removeGroupMembers(RemoveGroupMembersInput input) throws Exception;

    /**
     * Create a new group. Returns the urn of the newly created group. Requires the Manage Users & Groups Platform Privilege
     */
    String createGroup(CreateGroupInput input) throws Exception;

    /**
     * Create a new Domain. Returns the urn of the newly created Domain. Requires the 'Create Domains' or 'Manage Domains' Platform Privilege. If a Domain with the provided ID already exists,
it will be overwritten.
     */
    String createDomain(CreateDomainInput input) throws Exception;

    /**
     * Delete a Domain
     */
    Boolean deleteDomain(String urn) throws Exception;

    /**
     * Sets the Domain for a Dataset, Chart, Dashboard, Data Flow (Pipeline), or Data Job (Task). Returns true if the Domain was successfully added, or already exists. Requires the Edit Domains privilege for the Entity.
     */
    Boolean setDomain(String entityUrn, String domainUrn) throws Exception;

    /**
     * Sets the Domain for a Dataset, Chart, Dashboard, Data Flow (Pipeline), or Data Job (Task). Returns true if the Domain was successfully removed, or was already removed. Requires the Edit Domains privilege for an asset.
     */
    Boolean unsetDomain(String entityUrn) throws Exception;

    /**
     * Sets the Deprecation status for a Metadata Entity. Requires the Edit Deprecation status privilege for an entity.
     */
    Boolean updateDeprecation(UpdateDeprecationInput input) throws Exception;

    /**
     * Update a particular Corp User's editable properties
     */
    CorpUser updateCorpUserProperties(String urn, CorpUserUpdateInput input) throws Exception;

    /**
     * Update a particular Corp Group's editable properties
     */
    CorpGroup updateCorpGroupProperties(String urn, CorpGroupUpdateInput input) throws Exception;

    /**
     * Remove an assertion associated with an entity. Requires the 'Edit Assertions' privilege on the entity.
     */
    Boolean deleteAssertion(String urn) throws Exception;

    /**
     * Report a new operation for an asset
     */
    String reportOperation(ReportOperationInput input) throws Exception;

    /**
     * Create a new GlossaryTerm. Returns the urn of the newly created GlossaryTerm. If a term with the provided ID already exists, it will be overwritten.
     */
    String createGlossaryTerm(CreateGlossaryEntityInput input) throws Exception;

    /**
     * Create a new GlossaryNode. Returns the urn of the newly created GlossaryNode. If a node with the provided ID already exists, it will be overwritten.
     */
    String createGlossaryNode(CreateGlossaryEntityInput input) throws Exception;

    /**
     * Updates the parent node of a resource. Currently only GlossaryNodes and GlossaryTerms have parentNodes.
     */
    Boolean updateParentNode(UpdateParentNodeInput input) throws Exception;

    /**
     * Remove a glossary entity (GlossaryTerm or GlossaryNode). Return boolean whether it was successful or not.
     */
    Boolean deleteGlossaryEntity(String urn) throws Exception;

    /**
     * Updates the name of the entity.
     */
    Boolean updateName(UpdateNameInput input) throws Exception;

    /**
     * Add multiple related Terms to a Glossary Term to establish relationships
     */
    Boolean addRelatedTerms(RelatedTermsInput input) throws Exception;

    /**
     * Remove multiple related Terms for a Glossary Term
     */
    Boolean removeRelatedTerms(RelatedTermsInput input) throws Exception;

    /**
     * Generates an invite token that can be shared with prospective users to create their accounts.
     */
    InviteToken createNativeUserInviteToken() throws Exception;

    /**
     * Generates a token that can be shared with existing native users to reset their credentials.
     */
    ResetToken createNativeUserResetToken(CreateNativeUserResetTokenInput input) throws Exception;

    /**
     * Create a new Secret
     */
    String createSecret(CreateSecretInput input) throws Exception;

    /**
     * Delete a Secret
     */
    String deleteSecret(String urn) throws Exception;

    /**
     * Create a new ingestion source
     */
    String createIngestionSource(UpdateIngestionSourceInput input) throws Exception;

    /**
     * Update an existing ingestion source
     */
    String updateIngestionSource(String urn, UpdateIngestionSourceInput input) throws Exception;

    /**
     * Delete an existing ingestion source
     */
    String deleteIngestionSource(String urn) throws Exception;

    /**
     * Create a request to execute an ingestion job
input: Input required for creating an ingestion execution request
     */
    String createIngestionExecutionRequest(CreateIngestionExecutionRequestInput input) throws Exception;

    /**
     * Cancel a running execution request, provided the urn of the original execution request
     */
    String cancelIngestionExecutionRequest(CancelIngestionExecutionRequestInput input) throws Exception;

    /**
     * Generates an access token for DataHub APIs for a particular user & of a particular type
     */
    AccessToken createAccessToken(CreateAccessTokenInput input) throws Exception;

    /**
     * Revokes access tokens.
     */
    boolean revokeAccessToken(String tokenId) throws Exception;

    /**
     * Create a new test
     */
    String createTest(CreateTestInput input) throws Exception;

    /**
     * Update an existing test
     */
    String updateTest(String urn, UpdateTestInput input) throws Exception;

    /**
     * Create an existing test - note that this will NOT delete dangling pointers until the next execution of the test.
     */
    Boolean deleteTest(String urn) throws Exception;

}