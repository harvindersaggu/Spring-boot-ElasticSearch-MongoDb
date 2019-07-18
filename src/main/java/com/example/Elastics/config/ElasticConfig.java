package com.example.Elastics.config;

import java.io.IOException;

import org.elasticsearch.node.NodeBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.stereotype.Component;

@Component
@EnableElasticsearchRepositories(basePackages = "com.example.Elastics")
public class ElasticConfig {

	@Bean
	public NodeBuilder nodeBuilder() {
		return new NodeBuilder();
	}

	@Bean
	public ElasticsearchOperations elasticsearchTemplate() throws IOException {

		return new ElasticsearchTemplate(nodeBuilder().local(true).node().client());
	}
}
