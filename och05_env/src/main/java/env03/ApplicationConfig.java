package env03;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
public class ApplicationConfig {
	@Value("${admin.id}")
	private String adminID;
	@Value("${admin.pw}")
	private String adminPW;
	@Value("${sub_admin.id}")
	private String sub_adminID;
	@Value("${sub_admin.pw}")
	private String sub_adminPW;

	@Bean
	public static PropertySourcesPlaceholderConfigurer Properties() {
		PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();

		System.out.println("2. Properties Run");

		Resource[] locations = new Resource[2];
		locations[0] = new ClassPathResource("admin3.properites");
		locations[1] = new ClassPathResource("sub_admin3.properites");
		configurer.setLocations(locations);

		return configurer;
	}

	@Bean
	public AdminConnection adminConfig() {
		AdminConnection adminConnection = new AdminConnection();

		System.out.println("3. adminConfig Run");

		adminConnection.setAdminID(adminID);
		adminConnection.setAdminPW(adminPW);
		adminConnection.setSub_adminID(sub_adminID);
		adminConnection.setSub_adminPW(sub_adminPW);

		return adminConnection;
	}
}
