/*
 * package com.example.Elastics;
 * 
 * import java.util.List;
 * 
 * import org.elasticsearch.index.query.QueryBuilder; import
 * org.elasticsearch.index.query.QueryBuilders; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.data.elasticsearch.core.ElasticsearchTemplate; import
 * org.springframework.data.elasticsearch.core.query.NativeSearchQuery; import
 * org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
 * import org.springframework.stereotype.Component;
 * 
 * import com.example.Elastics.model.Customer;
 * 
 * @Component public class SearchQueryBuilder {
 * 
 * @Autowired private ElasticsearchTemplate elasticsearchTemplate;
 * 
 * public List<Customer> getAll(String text) {
 * 
 * QueryBuilder query = QueryBuilders.queryStringQuery(text) .field("name")
 * .field("teamName");
 * 
 * NativeSearchQuery build = new NativeSearchQueryBuilder() .withQuery(query)
 * .build();
 * 
 * List<Customer> list = elasticsearchTemplate.queryForList(build,
 * Customer.class);
 * 
 * return list; } }
 */