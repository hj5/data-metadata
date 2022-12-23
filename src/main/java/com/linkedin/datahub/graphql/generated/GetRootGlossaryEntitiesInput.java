package com.linkedin.datahub.graphql.generated;


/**
 * Input required when getting Business Glossary entities
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2022-12-16T17:57:17+0800"
)
public class GetRootGlossaryEntitiesInput implements java.io.Serializable {

    private int start;
    private int count;

    public GetRootGlossaryEntitiesInput() {
    }

    public GetRootGlossaryEntitiesInput(int start, int count) {
        this.start = start;
        this.count = count;
    }

    public int getStart() {
        return start;
    }
    public void setStart(int start) {
        this.start = start;
    }

    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }



    public static GetRootGlossaryEntitiesInput.Builder builder() {
        return new GetRootGlossaryEntitiesInput.Builder();
    }

    public static class Builder {

        private int start;
        private int count;

        public Builder() {
        }

        public Builder setStart(int start) {
            this.start = start;
            return this;
        }

        public Builder setCount(int count) {
            this.count = count;
            return this;
        }


        public GetRootGlossaryEntitiesInput build() {
            return new GetRootGlossaryEntitiesInput(start, count);
        }

    }
}
