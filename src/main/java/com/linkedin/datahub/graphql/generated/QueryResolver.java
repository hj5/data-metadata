package com.linkedin.datahub.graphql.generated;


/**
 * Root type used for fetching DataHub Metadata
Coming soon listEntity queries for listing all entities of a given type
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public interface QueryResolver {

    /**
     * Fetch a Data Platform by primary key (urn)
     */
    DataPlatform dataPlatform(String urn) throws Exception;

    /**
     * Fetch a CorpUser, representing a DataHub platform user, by primary key (urn)
     */
    CorpUser corpUser(String urn) throws Exception;

    /**
     * Fetch a CorpGroup, representing a DataHub platform group by primary key (urn)
     */
    CorpGroup corpGroup(String urn) throws Exception;

    /**
     * Fetch a Dataset by primary key (urn)
     */
    Dataset dataset(String urn) throws Exception;

    /**
     * Fetch a Dataset by primary key (urn) at a point in time based on aspect versions (versionStamp)
     */
    VersionedDataset versionedDataset(String urn, String versionStamp) throws Exception;

    /**
     * Fetch a Dashboard by primary key (urn)
     */
    Dashboard dashboard(String urn) throws Exception;

    /**
     * Fetch a Notebook by primary key (urn)
     */
    Notebook notebook(String urn) throws Exception;

    /**
     * Fetch a Chart by primary key (urn)
     */
    Chart chart(String urn) throws Exception;

    /**
     * Fetch a Data Flow (or Data Pipeline) by primary key (urn)
     */
    DataFlow dataFlow(String urn) throws Exception;

    /**
     * Fetch a Data Job (or Data Task) by primary key (urn)
     */
    DataJob dataJob(String urn) throws Exception;

    /**
     * Fetch a Tag by primary key (urn)
     */
    Tag tag(String urn) throws Exception;

    /**
     * Fetch a Glossary Term by primary key (urn)
     */
    GlossaryTerm glossaryTerm(String urn) throws Exception;

    /**
     * Fetch a Glossary Node by primary key (urn)
     */
    GlossaryNode glossaryNode(String urn) throws Exception;

    /**
     * Fetch an Entity Container by primary key (urn)
     */
    Container container(String urn) throws Exception;

    /**
     * Fetch a Domain by primary key (urn)
     */
    Domain domain(String urn) throws Exception;

    /**
     * Fetch an Assertion by primary key (urn)
     */
    Assertion assertion(String urn) throws Exception;

    /**
     * List all DataHub Access Policies
     */
    ListPoliciesResult listPolicies(ListPoliciesInput input) throws Exception;

    /**
     * Get all granted privileges for the given actor and resource
     */
    Privileges getGrantedPrivileges(GetGrantedPrivilegesInput input) throws Exception;

    /**
     * Incubating: Fetch an ML Model by primary key (urn)
     */
    MLModel mlModel(String urn) throws Exception;

    /**
     * Incubating: Fetch an ML Model Group by primary key (urn)
     */
    MLModelGroup mlModelGroup(String urn) throws Exception;

    /**
     * Incubating: Fetch a ML Feature by primary key (urn)
     */
    MLFeature mlFeature(String urn) throws Exception;

    /**
     * Incubating: Fetch a ML Feature Table by primary key (urn)
     */
    MLFeatureTable mlFeatureTable(String urn) throws Exception;

    /**
     * Incubating: Fetch a ML Primary Key by primary key (urn)
     */
    MLPrimaryKey mlPrimaryKey(String urn) throws Exception;

    /**
     * List all DataHub Users
     */
    ListUsersResult listUsers(ListUsersInput input) throws Exception;

    /**
     * List all DataHub Groups
     */
    ListGroupsResult listGroups(ListGroupsInput input) throws Exception;

    /**
     * Fetches the number of entities ingested by type
     */
    EntityCountResults getEntityCounts(EntityCountInput input) throws Exception;

    /**
     * List all DataHub Domains
     */
    ListDomainsResult listDomains(ListDomainsInput input) throws Exception;

    /**
     * Get all GlossaryTerms without a parentNode
     */
    GetRootGlossaryTermsResult getRootGlossaryTerms(GetRootGlossaryEntitiesInput input) throws Exception;

    /**
     * Get all GlossaryNodes without a parentNode
     */
    GetRootGlossaryNodesResult getRootGlossaryNodes(GetRootGlossaryEntitiesInput input) throws Exception;

    /**
     * Get whether or not not an entity exists
     */
    Boolean entityExists(String urn) throws Exception;

    /**
     * Gets the current invite token. If the optional regenerate param is set to true, generate a new invite token.
     */
    InviteToken getNativeUserInviteToken() throws Exception;

    /**
     * Gets an entity based on its urn
     */
    Entity entity(String urn) throws Exception;

    /**
     * Fetch details associated with the authenticated user, provided via an auth cookie or header
     */
    AuthenticatedUser me() throws Exception;

    /**
     * Fetch configurations
Used by DataHub UI
     */
    AppConfig appConfig() throws Exception;

    /**
     * Full text search against a specific DataHub Entity Type
     */
    SearchResults search(SearchInput input) throws Exception;

    /**
     * Search DataHub entities
     */
    SearchResults searchAcrossEntities(SearchAcrossEntitiesInput input) throws Exception;

    /**
     * Search across the results of a graph query on a node
     */
    SearchAcrossLineageResults searchAcrossLineage(SearchAcrossLineageInput input) throws Exception;

    /**
     * Autocomplete a search query against a specific DataHub Entity Type
     */
    AutoCompleteResults autoComplete(AutoCompleteInput input) throws Exception;

    /**
     * Autocomplete a search query against a specific set of DataHub Entity Types
     */
    AutoCompleteMultipleResults autoCompleteForMultiple(AutoCompleteMultipleInput input) throws Exception;

    /**
     * Hierarchically browse a specific type of DataHub Entity by path
Used by explore in the UI
     */
    BrowseResults browse(BrowseInput input) throws Exception;

    /**
     * Retrieve the browse paths corresponding to an entity
     */
    @javax.annotation.Nonnull
    java.util.List<BrowsePath> browsePaths(BrowsePathsInput input) throws Exception;

    /**
     * Deprecated, use appConfig Query instead
Whether the analytics feature is enabled in the UI
     */
    @Deprecated
    boolean isAnalyticsEnabled() throws Exception;

    /**
     * Retrieves a set of server driven Analytics Charts to render in the UI
     */
    @javax.annotation.Nonnull
    java.util.List<AnalyticsChartGroup> getAnalyticsCharts() throws Exception;

    /**
     * Retrieves a set of server driven Analytics Highlight Cards to render in the UI
     */
    @javax.annotation.Nonnull
    java.util.List<Highlight> getHighlights() throws Exception;

    /**
     * Retrieves a set of charts regarding the ingested metadata
     */
    @javax.annotation.Nonnull
    java.util.List<AnalyticsChartGroup> getMetadataAnalyticsCharts(MetadataAnalyticsInput input) throws Exception;

    /**
     * Fetch recommendations for a particular scenario
     */
    ListRecommendationsResult listRecommendations(ListRecommendationsInput input) throws Exception;

    /**
     * List all secrets stored in DataHub (no values)
     */
    ListSecretsResult listSecrets(ListSecretsInput input) throws Exception;

    /**
     * Fetch the values of a set of secrets. The caller must have the MANAGE_SECRETS
privilege to use.
     */
    @javax.annotation.Nonnull
    java.util.List<SecretValue> getSecretValues(GetSecretValuesInput input) throws Exception;

    /**
     * List all ingestion sources
     */
    ListIngestionSourcesResult listIngestionSources(ListIngestionSourcesInput input) throws Exception;

    /**
     * Fetch a specific ingestion source
urn: The primary key associated with the ingestion source.
     */
    IngestionSource ingestionSource(String urn) throws Exception;

    /**
     * Get an execution request
urn: The primary key associated with the execution request.
     */
    ExecutionRequest executionRequest(String urn) throws Exception;

    /**
     * Generates an access token for DataHub APIs for a particular user & of a particular type
Deprecated, use createAccessToken instead
     */
    AccessToken getAccessToken(GetAccessTokenInput input) throws Exception;

    /**
     * List access tokens stored in DataHub.
     */
    @javax.annotation.Nonnull
    ListAccessTokenResult listAccessTokens(ListAccessTokenInput input) throws Exception;

    /**
     * Returns the most recent changes made to each column in a dataset at each dataset version.
     */
    GetSchemaBlameResult getSchemaBlame(GetSchemaBlameInput input) throws Exception;

    /**
     * Fetch a Test by primary key (urn)
     */
    Test test(String urn) throws Exception;

    /**
     * List all DataHub Tests
     */
    ListTestsResult listTests(ListTestsInput input) throws Exception;

}