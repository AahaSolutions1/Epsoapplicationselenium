package webpage;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Epsoapplication1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		driver.get("https://europa.eu/epso/application/passport/login.cfm?comp_id=");
		driver.findElement(By.xpath("//a[text()='Accept only essential cookies']")).click();
		driver.findElement(By.xpath("//a[text()='Close']")).click();
		String username = "janarthanan";
		String password = "jana12345@$";
		driver.findElement(By.cssSelector("input[name='login']")).sendKeys(username);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.xpath("//a[text()='latest news and information']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Accept only essential cookies']")).click();
		driver.findElement(By.xpath("//a[text()='Close']")).click();
		driver.findElement(By.xpath("//a[text()='Jobs & traineeships']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,500)");
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Heads of Administration in EU Delegations")).click();
		driver.findElement(By.xpath("//a[text()='Apply for EPSO/AST/153/22']")).click();
		Set<String> handles = driver.getWindowHandles();
	    Iterator<String> it = handles.iterator();
	    String parentWindow = it.next();
	    String childWindow = it.next();
	    driver.switchTo().window(childWindow);
	    driver.findElement(By.cssSelector("input[name='login']")).sendKeys(username);
	    driver.findElement(By.cssSelector("input[name='password']")).sendKeys(password);
	    driver.findElement(By.cssSelector("button[type='submit']")).click();
	    WebElement option1 = driver.findElement(By.cssSelector("select[id='legal_doc_type_id']"));
	    Select dropdown1 = new Select(option1);
	    dropdown1.selectByIndex(1);
	    String id = "ABC12345";
	    driver.findElement(By.cssSelector("input[id='legal_doc_info']")).sendKeys(id);
	    WebElement option2 = driver.findElement(By.cssSelector("select[id='cbt_sitecode']"));
	    Select dropdown2 = new Select(option2);
	    dropdown2.selectByIndex(6);
	    WebElement option3 = driver.findElement(By.cssSelector("select[id='lang_id_1']"));
	    Select dropdown3 = new Select(option3);
	    dropdown3.selectByIndex(6);
	    WebElement option4 = driver.findElement(By.cssSelector("select[id='lang_id_2']"));
	    Select dropdown4 = new Select(option4);
	    dropdown4.selectByIndex(2);
	    WebElement option5 = driver.findElement(By.cssSelector("select[id='lang_id_3']"));
	    Select dropdown5 = new Select(option5);
	    dropdown5.selectByIndex(1);
	    WebElement option6 = driver.findElement(By.cssSelector("select[id='lang_id_4']"));
	    Select dropdown6 = new Select(option6);
	    dropdown6.selectByIndex(6);
	    WebElement option7 = driver.findElement(By.cssSelector("select[id='questions_4']"));
	    Select dropdown7 = new Select(option7);
	    dropdown7.selectByIndex(1);
	    WebElement option8 = driver.findElement(By.cssSelector("select[name='questions_31']"));
	    Select dropdown8 = new Select(option8);
	    dropdown8.selectByIndex(13);
	    WebElement option9 = driver.findElement(By.cssSelector("select[name='questions_32']"));
	    Select dropdown9 = new Select(option9);
	    dropdown9.selectByIndex(6);
	    WebElement opt1 = driver.findElement(By.cssSelector("select[id='questions_28']"));
	    Select dropdownone = new Select(opt1);
	    dropdownone.selectByIndex(1);
	    WebElement opt2 = driver.findElement(By.cssSelector("select[name='questions_29']"));
	    Select dropdowntwo = new Select(opt2);
	    dropdowntwo.selectByIndex(1);
	    WebElement opt3 = driver.findElement(By.cssSelector("select[name='questions_27']"));
	    Select dropdownthree = new Select(opt3);
	    dropdownthree.selectByIndex(1);
	    WebElement opt4 = driver.findElement(By.cssSelector("select[id='questions_26']"));
	    Select dropdownfour = new Select(opt4);
	    dropdownfour.selectByIndex(1);
	    WebElement opt5 = driver.findElement(By.cssSelector("select[id='questions_25']"));
	    Select dropdownfive = new Select(opt5);
	    dropdownfive.selectByIndex(1);
	    WebElement opt6 = driver.findElement(By.cssSelector("select[id='media_idx']"));
	    Select dropdownsix = new Select(opt6);
	    dropdownsix.selectByVisibleText("EU-Careers.eu / EPSO website");
	    driver.findElement(By.xpath("//button[@name='save_next_button']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@class='duet-date__toggle']")).click();
	    Thread.sleep(2000);
	    WebElement optn = driver.findElement(By.cssSelector("select[class='duet-date__select--month']"));
	    Select drop = new Select(optn);
	    drop.selectByIndex(2);
	    WebElement optn1 = driver.findElement(By.xpath("//select[@class='duet-date__select--year']"));
	    Select drop1 = new Select(optn1);
	    drop1.selectByIndex(60);
	    driver.findElement(By.xpath("//span[text()='6']")).click();
	    driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[2]/duet-date-picker[1]/div[1]/div[1]/button[1]/span[1]/*[1]")).click();
	    driver.findElement(By.xpath("//input[@id='education_end_date_1']")).sendKeys("17/05/2014");
	    WebElement optn3 = driver.findElement(By.cssSelector("select[id='education_type_1']"));
	    Select drop3 = new Select(optn3);
	    drop3.selectByIndex(8);
	    String addDetails = "Accounting";
	    driver.findElement(By.cssSelector("input[name='unlisted_category_1']")).sendKeys(addDetails);
	    String org = "Financial audit, 67CP+795 - Trade Centre - Trade Centre 2 - Dubai - United Arab Emirate and INTOSAI";
	    driver.findElement(By.xpath("//textarea[@id='education_establishment_1']")).sendKeys(org);
	    String subjects = "Healthy skepticism, Critical thinking, Business acumen, Initiative, Empathy, Communication skills, Executive presence, Curiosity, Cross-functional training";
	    driver.findElement(By.cssSelector("textarea[name='education_subjects_1']")).sendKeys(subjects);
	    WebElement optn4 = driver.findElement(By.cssSelector("select[id='diploma_country_id_1']"));
	    Select drop4 = new Select(optn4);
	    drop4.selectByIndex(10);
	    WebElement optn5 = driver.findElement(By.cssSelector("select[name='diploma_id_1']"));
	    Select drop5 = new Select(optn5);
	    drop5.selectByIndex(7);
	    String addDetail = "Public Administration";
	    driver.findElement(By.cssSelector("input[name='education_title_1']")).sendKeys(addDetail);
	    String classification = "National accounts are the implementation of complete and consistent accounting techniques for measuring the economic activity of a nation. These include detailed underlying measures that rely on double-entry accounting.";
	    driver.findElement(By.cssSelector("textarea[id='education_level_1']")).sendKeys(classification);
	    driver.findElement(By.cssSelector("button[id='save_next_button']")).click();

	    driver.findElement(By.cssSelector("input[name='add_entry_button']")).click();
	    driver.findElement(By.xpath("//button[@class='duet-date__toggle']")).click();
	    WebElement op1 = driver.findElement(By.cssSelector("select[class='duet-date__select--month']"));
	    Select d1 = new Select(op1);
	    d1.selectByIndex(1);
	    WebElement op2 = driver.findElement(By.xpath("//select[@class='duet-date__select--year']"));
	    Select d2 = new Select(op2);
	    d2.selectByIndex(65);
	    driver.findElement(By.xpath("//span[text()='10']")).click();
	    driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[2]/duet-date-picker[1]/div[1]/div[1]/button[1]/span[1]/*[1]")).click();
	    driver.findElement(By.cssSelector("input[id='experience_end_date_1']")).sendKeys("16/08/2022");
	    driver.findElement(By.cssSelector("input[name='experience_month_count_1']")).sendKeys("90");
	    driver.findElement(By.cssSelector("input[name='experience_day_count_1']")).sendKeys("3");
	    WebElement op4 = driver.findElement(By.cssSelector("select[name='wexp_type_id_1']"));
	    Select d4 = new Select(op4);
	    d4.selectByIndex(8);
	    String additionalDetails = "Standards on Auditing";
	    driver.findElement(By.xpath("//input[@id='unlisted_type_1']")).sendKeys(additionalDetails);
	    WebElement op5 = driver.findElement(By.xpath("//select[@name='wexp_class_id_1']"));
	    Select d5 = new Select(op5);
	    d5.selectByIndex(10);
	    String addDetails1 = "Ministry Of Corporate Affairs";
	    driver.findElement(By.cssSelector("input[id='unlisted_class_1']")).sendKeys(addDetails1);
	    String business = "An audit examines your business�s financial records to verify they are accurate. This is done through a systematic review of your transactions. Audits look at things like your financial statements and accounting books for small business. Many businesses have routine audits once per year.";
	    driver.findElement(By.cssSelector("textarea[name='experience_biztype_1']")).sendKeys(business);
	    String address = "A.F. Ferguson & Co., State Life Building No. 1/C, I.I. Chundrigar Road, Karachi";
	    driver.findElement(By.cssSelector("textarea[name='experience_employer_1']")).sendKeys(address);
	    String occupation = "Public sector";
	    driver.findElement(By.cssSelector("textarea[name='experience_occupation_1']")).sendKeys(occupation);
	    String duties = "Prepare an Audit Report, Form a negative opinion, where necessary, Make inquiries, Lend assistance in case of a branch audit, Comply with Auditing Standards, Reporting of fraud, Adhere to the Code of Ethics and Code of Professional Conduct, Assistance in an investigation";
	    driver.findElement(By.xpath("//textarea[@name='experience_duties_1']")).sendKeys(duties);
	    driver.findElement(By.cssSelector("input[value='Add New Entry']")).click();
	    driver.findElement(By.cssSelector("input[id='experience_start_date_2']")).sendKeys("10/02/2015");
	    driver.findElement(By.cssSelector("input[id='experience_end_date_2']")).sendKeys("16/08/2022");
	    driver.findElement(By.cssSelector("input[id='part_time_yes_2']")).click();
	    driver.findElement(By.cssSelector("input[name='experience_month_count_2']")).sendKeys("90");
	    driver.findElement(By.cssSelector("input[name='experience_day_count_2']")).sendKeys("3");
	    WebElement op41 = driver.findElement(By.cssSelector("select[name='wexp_type_id_2']"));
	    Select d41 = new Select(op41);
	    d41.selectByIndex(8);
	    String additionalDetails1 = "Standards on Auditing";
	    driver.findElement(By.xpath("//input[@id='unlisted_type_2']")).sendKeys(additionalDetails1);
	    WebElement op51 = driver.findElement(By.xpath("//select[@name='wexp_class_id_2']"));
	    Select d51 = new Select(op51);
	    d51.selectByIndex(10);
	    String addDetails11 = "Ministry Of Corporate Affairs";
	    driver.findElement(By.cssSelector("input[id='unlisted_class_2']")).sendKeys(addDetails11);
	    String business1 = "An audit examines your business�s financial records to verify they are accurate. This is done through a systematic review of your transactions. Audits look at things like your financial statements and accounting books for small business. Many businesses have routine audits once per year.";
	    driver.findElement(By.cssSelector("textarea[name='experience_biztype_2']")).sendKeys(business1);
	    String address1 = "A.F. Ferguson & Co., State Life Building No. 1/C, I.I. Chundrigar Road, Karachi";
	    driver.findElement(By.cssSelector("textarea[name='experience_employer_2']")).sendKeys(address1);
	    String occupation1 = "Public sector";
	    driver.findElement(By.cssSelector("textarea[name='experience_occupation_2']")).sendKeys(occupation1);
	    String duties1 = "Prepare an Audit Report, Form a negative opinion, where necessary, Make inquiries, Lend assistance in case of a branch audit, Comply with Auditing Standards, Reporting of fraud, Adhere to the Code of Ethics and Code of Professional Conduct, Assistance in an investigation";
	    driver.findElement(By.xpath("//textarea[@name='experience_duties_2']")).sendKeys(duties1);
	    driver.findElement(By.cssSelector("input[id='st_percentage_2_857']")).sendKeys("5");
	    driver.findElement(By.cssSelector("input[id='st_percentage_2_858']")).sendKeys("5");
	    driver.findElement(By.cssSelector("input[id='st_percentage_2_859']")).sendKeys("5");
	    driver.findElement(By.cssSelector("input[id='st_percentage_2_860']")).sendKeys("4");
	    driver.findElement(By.cssSelector("input[id='st_percentage_2_861']")).sendKeys("5");
	    driver.findElement(By.cssSelector("input[id='st_percentage_2_862']")).sendKeys("4");
	    driver.findElement(By.cssSelector("input[id='st_percentage_2_863']")).sendKeys("5");
	    driver.findElement(By.cssSelector("input[id='st_percentage_2_864']")).sendKeys("5");
	    driver.findElement(By.xpath("//button[@name='save_next_button']")).click();
	    WebElement op6 = driver.findElement(By.cssSelector("select[id='language_1']"));
	    Select d6 = new Select(op6);
	    d6.selectByIndex(6);
	    WebElement op7 = driver.findElement(By.cssSelector("select[id='language_2']"));
	    Select d7 = new Select(op7);
	    d7.selectByIndex(9);
	    WebElement op8 = driver.findElement(By.cssSelector("select[name='listen_level_1']"));
	    Select d8 = new Select(op8);
	    d8.selectByIndex(2);
	    WebElement op9 = driver.findElement(By.cssSelector("select[name='listen_level_2']"));
	    Select d9 = new Select(op9);
	    d9.selectByIndex(4);
	    WebElement opton = driver.findElement(By.xpath("//select[@name='read_level_1']"));
	    Select dropdwn = new Select(opton);
	    dropdwn.selectByIndex(2);
	    WebElement opton1 = driver.findElement(By.xpath("//select[@name='read_level_2']"));
	    Select dropdwn1 = new Select(opton1);
	    dropdwn1.selectByIndex(4);
	    WebElement opton2 = driver.findElement(By.xpath("//select[@name='speak_level_1']"));
	    Select dropdwn2 = new Select(opton2);
	    dropdwn2.selectByIndex(2);
	    WebElement opton3 = driver.findElement(By.xpath("//select[@name='speak_level_2']"));
	    Select dropdwn3 = new Select(opton3);
	    dropdwn3.selectByIndex(4);
	    WebElement opton4 = driver.findElement(By.cssSelector("select[name='write_level_1']"));
	    Select dropdwn4 = new Select(opton4);
	    dropdwn4.selectByValue("B1");
	    WebElement opton5 = driver.findElement(By.cssSelector("select[name='write_level_2']"));
	    Select dropdwn5 = new Select(opton5);
	    dropdwn5.selectByIndex(4);
	    driver.findElement(By.cssSelector("button[name='save_next_button']")).click();
	    String experience = "An audit is an educational term for the completion of a course of study for which no assessment of the performance of the student is made nor grade awarded. Some institutions may record a grade of audit to those who have elected not to receive a letter grade for a course in which they are typically awarded. Internal audit manager Daniel has spent the last eight years as an auditor or consultant and has held many positions from associate to manager. He currently works for a large retailer as an internal auditor. Daniel helps clients prepare for external auditors for their annual review.";
	    driver.findElement(By.xpath("//textarea[@name='background']")).sendKeys(experience);
	    String opportunity = "Because of the nature of their work, auditors become trusted members of both the staffs of the companies where they work and in society at large. The honesty and integrity that their work demands means that people can come to trust them. Companies need to be able to rely on trustworthy individuals to maintain not only their public image and brand integrity but also their reputation in the business world. This is equally true whether applied to major corporations or small businesses. \r\n"
	    		+ "The best way to answer this important question is to do your research on the position and provide details on how you're the right fit.";
	    driver.findElement(By.xpath("//textarea[@id='motivation_2']")).sendKeys(opportunity);
	    String contribution = "When writing your application you are asked for your motivation to work for the EU. Giving EPSO good reasons for why you would like to pursue an EU career can be a daunting task. Nobody wants to write clich� stuff or jiberish, so this can be a real thought-exercise for anyone taking it seriously. First of all, ensure that you clearly understand about your roles, responsibilities expected by the team and company.\r\n"
	    		+ "Team Player\r\n"
	    		+ "Time Management\r\n"
	    		+ "Good at managing people\r\n"
	    		+ "Meeting deadlines\r\n"
	    		+ "Always finish my tasks\r\n"
	    		+ "Good listener\r\n"
	    		+ "Problem Solver\r\n";
	    driver.findElement(By.cssSelector("textarea[lab='the contribution']")).sendKeys(contribution);
	    String achievement = "My greatest accomplishment is graduating near the top of my class last year.\r\n"
	    		+ "My greatest accomplishment is graduating in the top 3% of my class of over 2,000 students last year, with a GPA of 6.88";
	    driver.findElement(By.cssSelector("textarea[name='strengths']")).sendKeys(achievement);
	    driver.findElement(By.xpath("//button[text()='Save this page and Next']")).click();
	    for(int i=0;i<7;i++) {
	        driver.findElements(By.cssSelector("input[value='yes']")).get(i).click();
	    }
	    driver.findElement(By.xpath("//table[@id='footer_table2']/tbody/tr/td/button[@name='save_edit_confirm_button']")).click();
	    driver.findElement(By.cssSelector("input[id='quest_8418_Y']")).click();
	    String s1 = "L'IB rappelle � tous les candidats, avant de postuler au r�le, de v�rifier et de se conformer � toute politique\r\n"
	    		+ "que leur employeur pourrait avoir concernant un travail suppl�mentaire de cette nature. L�IB encourage\r\n"
	    		+ "tous les candidats � discuter de leur candidature avec leur employeur.\r\n"
	    		+ "Vous devez imp�rativement lire la politique de l�IB en mati�re de recrutement des examinateurs avant de\r\n"
	    		+ "remplir le pr�sent formulaire de candidature. Cette politique est disponible sur la page du site Web public\r\n"
	    		+ "de l�IB consacr�e au recrutement des examinateurs � l�adresse suivante.";
	    driver.findElement(By.cssSelector("textarea[id='quest_8419']")).sendKeys(s1);
	    driver.findElement(By.cssSelector("input[id='quest_8420_Y']")).click();
	    String s2 = "Ce formulaire sert � recueillir les informations n�cessaires pour\r\n"
	    		+ "participer � l�Appel � solutions : innovation et comp�tences de\r\n"
	    		+ "l�OIT. Veuillez-vous assurer que toutes les informations essentielles\r\n"
	    		+ "concernant votre id�e ou solution sont incluses dans ce formulaire\r\n"
	    		+ "et que les documents justificatifs sont fournis comme demand�.";
	    driver.findElement(By.cssSelector("textarea[lab='Question 2b']")).sendKeys(s2);
	    driver.findElement(By.cssSelector("input[id='quest_8422_Y']")).click();
	    String s3 = "Bienvenue dans cette enqu�te sur la coop�ration pour le d�veloppement des Nations Unies\r\n"
	    		+ "r�alis�e � la demande de l�Assembl�e g�n�rale de l�ONU.\r\n."
	    		+ "L�enqu�te a pour objectif de donner � tous les pays l�occasion de fournir un retour d�information\r\n"
	    		+ "sur les performances du syst�me de d�veloppement des Nations Unies qui les soutient dans leurs\r\n"
	    		+ "efforts en vue de la mise en �uvre du Programme de d�veloppement durable � l�horizon 2030.\r\n"
	    		+ "L�enqu�te porte sur le suivi des dispositions des r�solutions de l�Assembl�e g�n�rale sur les\r\n"
	    		+ "activit�s op�rationnelles du syst�me de d�veloppement des Nations Unies, et notamment des\r\n"
	    		+ "r�solutions de l�AG relatives � l�Examen quadriennal complet des politiques (EQCP) et au\r\n"
	    		+ "repositionnement du syst�me de d�veloppement des Nations Unies. Les r�sultats de l�enqu�te\r\n"
	    		+ "repr�senteront une contribution importante aux travaux du Conseil �conomique et social des\r\n"
	    		+ "Nations Unies charg� de superviser la mise en �uvre par le syst�me des Nations Unies de\r\n"
	    		+ "l�examen quadriennal complet des politiques et l�efficacit�, l�efficience et la pertinence continues\r\n"
	    		+ "des activit�s op�rationnelles des Nations Unies pour le d�veloppement.";
	    driver.findElement(By.cssSelector("textarea[id='quest_8423']")).sendKeys(s3);
	    driver.findElement(By.xpath("//input[@lab='Question 4a'][2]")).click();
	    String s4 = "Les �l�ments des canaux de service suivants ont pu s'appliquer � vos interactions avec les bureaux r�gionaux du premier contact jusqu'� l'audience, sans toutefois l'inclure. Pour chaque �l�ment, veuillez indiquer dans quelle mesure vous avez �t� satisfait du canaux de service.";
	    driver.findElement(By.xpath("//textarea[@lab='Question 4b']")).sendKeys(s4);
	    driver.findElement(By.xpath("//input[@id='quest_8426_Y']")).click();
	    String s5 = "Cette fa�on de voir les choses convenait sans doute admirablement pour modifier les programmes des MBA tels qu�on les con�oit aujourd�hui. Mais pas pour r�inventer l�enseignement du management. En toute logique, nous sommes partis d�un point de d�part diff�rent, qui consiste � remplacer ce qui est � enseign� � par ce qui est appris, et les � �tudiants �, les � jeunes �, la � cr�me �, par des adultes exp�riment�s. Nous remettons en cause la notion m�me de � programme �, ainsi certainement que d�ordre et de s�quences - l�enseignement du management souffre d�j� d�un exc�s de structure.";
	    driver.findElement(By.cssSelector("textarea[lab='Question 5b']")).sendKeys(s5);
	    driver.findElement(By.cssSelector("input[id='quest_8428_Y']")).click();
	    String s6 = "La CEPEJ souhaite utiliser la m�thodologie d�velopp�e dans le cadre des cycles d'�valuation pr�c�dents pour obtenir, en\r\n"
	    		+ "s'appuyant sur son r�seau de correspondants nationaux, une �valuation globale des syst�mes judiciaires des 47 Etats\r\n"
	    		+ "membres du Conseil de l'Europe ainsi que de trois pays observateurs (Isra�l, le Maroc et le Kazakhstan). Ceci permettra aux\r\n"
	    		+ "d�cideurs publics et aux praticiens du droit d�agir en tenant compte de ces informations uniques.";
	    driver.findElement(By.cssSelector("textarea[id='quest_8429']")).sendKeys(s6);
	    driver.findElement(By.xpath("//input[@lab='Question 7a'][2]")).click();
	    String s7 = "le terme de biais renvoie � une influence syst�matique sur les informations qui n'�tait pas\r\n"
	    		+ "pr�vue. Par exemple, des personnes peuvent r�pondre de mani�re tr�s n�gative � des questions sur\r\n"
	    		+ "leur fa�on de faire parce qu'elles pensent que cela peut leur permettre d'acc�der � des services. Ou, des\r\n"
	    		+ "personnes peuvent cacher leurs �motions n�gatives parce qu'elles ne veulent pas para�tre faibles aux\r\n"
	    		+ "yeux des autres. En outre, les questions pos�es peuvent �tre biais�es par l'enqu�teur et influencer les\r\n"
	    		+ "r�ponses. Il est important que les �quipes d'�valuation r�fl�chissent et r�digent un rapport sur la fa�on\r\n"
	    		+ "dont les r�ponses aux questions peuvent �tre biais�es.";
	    driver.findElement(By.cssSelector("textarea[lab='Question 7b']")).sendKeys(s7);
	    driver.findElement(By.cssSelector("input[id='quest_8432_Y']")).click();
	    String s8 = "Pour les employeurs qui recherchent le meilleur candidat pour une offre d'emploi, la section exp�rience professionnelle d'un CV est une mine d'or d'informations. Si vous �prouvez des difficult�s � inclure vos exp�riences professionnelles dans vos CV, cet article vous donnera quelques lignes directrices pour bien pr�senter vos comp�tences professionnelles. De plus, il contient de nombreux conseils et exemples pour vous aider � r�diger un CV qui vous permettra peut-�tre d'obtenir l'emploi de vos r�ves.";
	    driver.findElement(By.cssSelector("textarea[id='quest_8433']")).sendKeys(s8);
	    driver.findElement(By.cssSelector("input[id='quest_8434_Y']")).click();
	    String s9 = "Tous les �l�ments de cette rubrique (objectifs et contexte de la certification, descriptif des\r\n"
	    		+ "activit�s professionnelles pour les CQP, comp�tences attest�es, modalit�s d��valuation) ont\r\n"
	    		+ "vocation � �tre publi�s sur le site public. Il s'agit ici de faire une synth�se des �l�ments pr�sents\r\n"
	    		+ "dans les r�f�rentiels joints � la demande et publi�s avec la fiche. Cette synth�se doit cependant\r\n"
	    		+ "�tre pleinement coh�rente avec les �l�ments de votre dossier d�enregistrement, � d�faut des\r\n"
	    		+ "pr�cisions pourront vous �tre demand�es lors de la phase de recevabilit� ou � tout moment de l�instruction.";
	    driver.findElement(By.cssSelector("textarea[id='quest_8435']")).sendKeys(s9);
	    driver.findElement(By.cssSelector("input[id='quest_8436_Y']")).click();
	    String s91 = "Tous les �l�ments de cette rubrique (objectifs et contexte de la certification, descriptif des\r\n"
	    		+ "activit�s professionnelles pour les CQP, comp�tences attest�es, modalit�s d��valuation) ont\r\n"
	    		+ "vocation � �tre publi�s sur le site public. Il s'agit ici de faire une synth�se des �l�ments pr�sents\r\n"
	    		+ "dans les r�f�rentiels joints � la demande et publi�s avec la fiche. Cette synth�se doit cependant\r\n"
	    		+ "�tre pleinement coh�rente avec les �l�ments de votre dossier d�enregistrement, � d�faut des\r\n"
	    		+ "pr�cisions pourront vous �tre demand�es lors de la phase de recevabilit� ou � tout moment de l�instruction.";
	    driver.findElement(By.cssSelector("textarea[id='quest_8437']")).sendKeys(s91);
	    driver.findElement(By.xpath("//button[@name='save_next_button']")).click();
	    JavascriptExecutor js1 = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,4685)");
	    driver.findElement(By.cssSelector("button[name='move_to_next_tab_button']")).click();
	    js.executeScript("window.scrollBy(0,200)");
        driver.findElement(By.xpath("//tr[@class='dataTableButtonRow'][2]/td[2]/button")).click();
//	    String validate = driver.findElement(By.xpath("//tr[@class='dataTableButtonRow'][2]/td[2]/button")).getText();
//	    Assert.assertEquals("Validate Application", validate);
	    if(driver.findElement(By.xpath("//tr[@class='dataTableButtonRow'][2]/td[2]/button")).isEnabled()) {
	    	driver.findElement(By.xpath("//tr[@class='dataTableButtonRow'][2]/td[2]/button")).click();
	    }
	    else {
	    	System.out.println("Element not clickable");
	    }
	    Thread.sleep(5000);
	    driver.switchTo().alert().dismiss();
////	    String validate1 = driver.findElement(By.xpath("//span[text()=' Your application is correct and can be validated.']")).getText();
////	    Assert.assertEquals("Application can be validated", validate1);
////	    Thread.sleep(2000);
//	   
//	    
//	    
////	    driver.findElement(By.cssSelector("input[id='pw']")).sendKeys(password);
////	    driver.findElement(By.xpath("//input[@onclick='validateApp(this, \"save_validate_app\");']")).click();
////	    driver.switchTo().alert().accept();
	    
	}

}
