package com.linkedin.datahub.graphql.generated;


/**
 * Parameters required to specify the page to land once clicked
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class LinkParams implements java.io.Serializable {

    private SearchParams searchParams;
    private EntityProfileParams entityProfileParams;

    public LinkParams() {
    }

    public LinkParams(SearchParams searchParams, EntityProfileParams entityProfileParams) {
        this.searchParams = searchParams;
        this.entityProfileParams = entityProfileParams;
    }

    /**
     * Context to define the search page
     */
    public SearchParams getSearchParams() {
        return searchParams;
    }
    /**
     * Context to define the search page
     */
    public void setSearchParams(SearchParams searchParams) {
        this.searchParams = searchParams;
    }

    /**
     * Context to define the entity profile page
     */
    public EntityProfileParams getEntityProfileParams() {
        return entityProfileParams;
    }
    /**
     * Context to define the entity profile page
     */
    public void setEntityProfileParams(EntityProfileParams entityProfileParams) {
        this.entityProfileParams = entityProfileParams;
    }



    public static LinkParams.Builder builder() {
        return new LinkParams.Builder();
    }

    public static class Builder {

        private SearchParams searchParams;
        private EntityProfileParams entityProfileParams;

        public Builder() {
        }

        /**
         * Context to define the search page
         */
        public Builder setSearchParams(SearchParams searchParams) {
            this.searchParams = searchParams;
            return this;
        }

        /**
         * Context to define the entity profile page
         */
        public Builder setEntityProfileParams(EntityProfileParams entityProfileParams) {
            this.entityProfileParams = entityProfileParams;
            return this;
        }


        public LinkParams build() {
            return new LinkParams(searchParams, entityProfileParams);
        }

    }
}
