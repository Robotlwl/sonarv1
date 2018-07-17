package com.example.demo.utils;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface Api {

	@GET("api/components/search_projects")
	Call<Object> apiMetricsSearch(@QueryMap Map<String, Object> map);

	@GET("api/metrics/search")
	Call<Object> images(@QueryMap Map<String, Object> map);

	// @GET("api/organizations/search")
	// Call<Object> apiOrganizationsSearch(@QueryMap Map<String,Object> map);

	@GET("api/organizations/search")
	Call<Object> apiOrganizationsSearch(@Query("organizations") String organizations);

	@GET("api/navigation/component")
	Call<Object> apiNavigationComponent(@QueryMap Map<String, Object> map);

	@GET("api/components/show")
	Call<Object> apiComponentsShow(@QueryMap Map<String, Object> map);

	@GET("api/ce/component")
	Call<Object> apiCeComponent(@Query("componentKey") String componentKey);

	@GET("api/measures/component")
	Call<Object> apiMeasuresComponent(@Query("additionalFields") String additionalFields,
			@Query("componentKey") String componentKey, @Query("metricKeys") String metricKeys);

	@GET("api/languages/list")
	Call<Object> apiLanguagesList();

	@GET("api/project_analyses/search")
	Call<Object> apiProjectAnalysesSearch(@Query("project") String project, @Query("ps") String ps);

	@GET("api/metrics/search")
	Call<Object> apiMetricsSearch(@Query("ps") String ps);

	@GET("api/rules/search")
	Call<Object> apiRulesSearch(@Query("qprofile") String qprofile, @Query("activation") String activation,
			@Query("statuses") String statuses, @Query("ps") String ps);

	@GET("api/project_links/search")
	Call<Object> apiProjectLinksSearch(@Query("projectKey") String projectKey);

	@GET("api/measures/search_history")
	Call<Object> apiMeasuresSearchHistory(@Query("component") String component, @Query("metrics") String metrics,
			@Query("ps") String ps);

	@GET("api/measures/component_tree")
	Call<Object> apiMeasuresComponentTree(@Query("ps") String ps, @Query("s") String s,
			@Query("baseComponentKey") String baseComponentKey, @Query("metricKeys") String metricKeys,
			@Query("strategy") String strategy);

	@GET("api/components/tree")
	Call<Object> apiComponentsTree(@Query("q") String q, @Query("s") String s, @Query("qualifiers") String qualifiers,
			@Query("component") String component);

	@GET("api/issues/search")
	Call<Object> apiIssuesSearch(@Query("componentKeys") String componentKeys, @Query("s") String s,
			@Query("resolved") String resolved, @Query("types") String types, @Query("ps") String ps,
			@Query("facets") String facets, @Query("additionalFields") String additionalFields);

	@GET("api/components/app")
	Call<Object> apiComponentsApp(@Query("component") String component);

	@GET("api/sources/lines")
	Call<Object> apiSourcesLines(@Query("key") String key, @Query("from") String from, @Query("to") String to);

}
