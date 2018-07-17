package com.example.demo;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.utils.Api;
import com.example.demo.utils.RetrofitFactory;

import retrofit2.Call;
import retrofit2.Response;

@RestController
@RequestMapping(value = "/v1")
public class ApiController {

	private static Api api;
	{
		if (api == null) {
			api = RetrofitFactory.getRetrofit("http://10.62.13.37:9000/").create(Api.class);
		}
	}

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public static Object test() {

		Map<String, Object> map = new HashMap<>();
		map.put("ps", "9999");

		Call<Object> cal = api.images(map);
		Object obj = null;

		try {
			Response<Object> re = cal.execute();
			obj = re.body();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return obj;
	}
	
	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	public static Object test1() {
		
		Map<String, Object> map = new HashMap<>();
		map.put("ps", "9999");
		
		Call<Object> cal = api.images(map);
		Object obj = null;
		
		try {
			Response<Object> re = cal.execute();
			obj = re.body();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return obj;
	}

	@RequestMapping(value = "/apiMeasuresSearch", method = RequestMethod.GET)
	public static Object apiMeasuresSearch() {
		Map<String, Object> map = new HashMap<>();
		map.put("", "");

		Call<Object> cal = api.apiMetricsSearch(map);
		Object obj = null;

		try {
			Response<Object> re = cal.execute();
			obj = re.body();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return obj;
	}

	// @RequestMapping(value = "/apiOrganizationsSearch", method =
	// RequestMethod.GET)
	// public static Object apiOrganizationsSearch() {
	// Map<String, Object> map = new HashMap<>();
	// map.put("", "");
	//
	// Call<Object> cal = api.apiOrganizationsSearch(map);
	// Object obj = null;
	//
	// try {
	// Response<Object> re = cal.execute();
	// obj = re.body();
	// } catch (IOException e) {
	// e.printStackTrace();
	// }
	// return obj;
	// }

	@RequestMapping(value = "/apiOrganizationsSearch", method = RequestMethod.GET)
	public static Object apiOrganizationsSearch(@RequestParam("organizations") String organizations) {

		Call<Object> cal = api.apiOrganizationsSearch(organizations);
		Object obj = null;

		try {
			Response<Object> re = cal.execute();
			obj = re.body();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return obj;
	}

	@RequestMapping(value = "/apiNavigationComponent", method = RequestMethod.GET)
	public static Object apiNavigationComponent() {
		Map<String, Object> map = new HashMap<>();
		map.put("componentKey", "im-webservice-server-develop");

		Call<Object> cal = api.apiNavigationComponent(map);
		Object obj = null;

		try {
			Response<Object> re = cal.execute();
			obj = re.body();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return obj;
	}

	@RequestMapping(value = "/apiComponentsShow", method = RequestMethod.GET)
	public static Object apiComponentsShow() {
		Map<String, Object> map = new HashMap<>();
		map.put("component", "im-webservice-server-develop");

		Call<Object> cal = api.apiComponentsShow(map);
		Object obj = null;

		try {
			Response<Object> re = cal.execute();
			obj = re.body();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return obj;
	}

	@RequestMapping(value = "/apiCeComponent", method = RequestMethod.GET)
	public static Object apiCeComponent(@RequestParam("componentKey") String componentKey) {

		Call<Object> cal = api.apiCeComponent(componentKey);
		Object obj = null;

		try {
			Response<Object> re = cal.execute();
			obj = re.body();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return obj;
	}

	/*
	 * GET Transfer multiple parameters
	 */
	@RequestMapping(value = "/apiMeasuresComponent", method = RequestMethod.GET)
	public static Object apiMeasuresComponent(@RequestParam("additionalFields") String additionalFields,
			@RequestParam("componentKey") String componentKey, @RequestParam("metricKeys") String metricKeys) {

		Call<Object> cal = api.apiMeasuresComponent(additionalFields, componentKey, metricKeys);
		Object obj = null;
		try {
			Response<Object> re = cal.execute();
			obj = re.body();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return obj;
	}

	@RequestMapping(value = "/apiLanguagesList", method = RequestMethod.GET)
	public static Object apiLanguagesList() {

		Call<Object> cal = api.apiLanguagesList();
		Object obj = null;

		try {
			Response<Object> re = cal.execute();
			obj = re.body();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return obj;
	}

	@RequestMapping(value = "/apiProjectAnalysesSearch", method = RequestMethod.GET)
	public static Object apiProjectAnalysesSearch(@RequestParam("project") String project,
			@RequestParam("ps") String ps) {

		Call<Object> cal = api.apiProjectAnalysesSearch(project, ps);
		Object obj = null;
		try {
			Response<Object> re = cal.execute();
			obj = re.body();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return obj;
	}

	@RequestMapping(value = "/apiMetricsSearch", method = RequestMethod.GET)
	public static Object apiMetricsSearch(@RequestParam("ps") String ps) {

		Call<Object> cal = api.apiMetricsSearch(ps);
		Object obj = null;

		try {
			Response<Object> re = cal.execute();
			obj = re.body();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return obj;
	}

	@RequestMapping(value = "/apiRulesSearch", method = RequestMethod.GET)
	public static Object apiRulesSearch(@RequestParam("qprofile") String qprofile,
			@RequestParam("activation") String activation, @RequestParam("statuses") String statuses,
			@RequestParam("ps") String ps) {

		Call<Object> cal = api.apiRulesSearch(qprofile, activation, statuses, ps);
		Object obj = null;
		try {
			Response<Object> re = cal.execute();
			obj = re.body();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return obj;
	}

	@RequestMapping(value = "/apiProjectLinksSearch", method = RequestMethod.GET)
	public static Object apiProjectLinksSearch(@RequestParam("projectKey") String projectKey) {

		Call<Object> cal = api.apiProjectLinksSearch(projectKey);
		Object obj = null;

		try {
			Response<Object> re = cal.execute();
			obj = re.body();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return obj;
	}

	@RequestMapping(value = "/apiMeasuresSearchHistory", method = RequestMethod.GET)
	public static Object apiMeasuresSearchHistory(@RequestParam("component") String component,
			@RequestParam("metrics") String metrics, @RequestParam("ps") String ps) {

		Call<Object> cal = api.apiMeasuresSearchHistory(component, metrics, ps);
		Object obj = null;
		try {
			Response<Object> re = cal.execute();
			obj = re.body();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return obj;
	}

	@RequestMapping(value = "/apiMeasuresComponentTree", method = RequestMethod.GET)
	public static Object apiMeasuresComponentTree(@RequestParam("ps") String ps, @RequestParam("s") String s,
			@RequestParam("baseComponentKey") String baseComponentKey, @RequestParam("metricKeys") String metricKeys,
			@RequestParam("strategy") String strategy) {

		Call<Object> cal = api.apiMeasuresComponentTree(ps, s, baseComponentKey, metricKeys, strategy);
		Object obj = null;
		try {
			Response<Object> re = cal.execute();
			obj = re.body();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return obj;
	}

	@RequestMapping(value = "/apiComponentsTree", method = RequestMethod.GET)
	public static Object apiComponentsTree(@RequestParam("q") String q, @RequestParam("s") String s,
			@RequestParam("qualifiers") String qualifiers, @RequestParam("component") String component) {

		Call<Object> cal = api.apiComponentsTree(q, s, qualifiers, component);
		Object obj = null;
		try {
			Response<Object> re = cal.execute();
			obj = re.body();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return obj;
	}

	@RequestMapping(value = "/apiIssuesSearch", method = RequestMethod.GET)
	public static Object apiIssuesSearch(@RequestParam("componentKeys") String componentKeys,
			@RequestParam("s") String s, @RequestParam("resolved") String resolved, @RequestParam("types") String types,
			@RequestParam("ps") String ps, @RequestParam("facets") String facets,
			@RequestParam("additionalFields") String additionalFields) {

		Call<Object> cal = api.apiIssuesSearch(componentKeys, s, resolved, types, ps, facets, additionalFields);
		Object obj = null;
		try {
			Response<Object> re = cal.execute();
			obj = re.body();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return obj;
	}

	@RequestMapping(value = "/apiComponentsApp", method = RequestMethod.GET)
	public static Object apiComponentsApp(@RequestParam("component") String component) {

		Call<Object> cal = api.apiComponentsApp(component);
		Object obj = null;

		try {
			Response<Object> re = cal.execute();
			obj = re.body();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return obj;
	}

	@RequestMapping(value = "/apiSourcesLines", method = RequestMethod.GET)
	public static Object apiSourcesLines(@RequestParam("key") String key, @RequestParam("from") String from,
			@RequestParam("to") String to) {

		Call<Object> cal = api.apiSourcesLines(key, from, to);
		Object obj = null;
		try {
			Response<Object> re = cal.execute();
			obj = re.body();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return obj;
	}

}
