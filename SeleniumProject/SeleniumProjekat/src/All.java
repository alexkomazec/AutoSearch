
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


import org.openqa.selenium.support.ui.Select;


import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;

public class All extends r {
	
	public static void main(String[] args) throws InterruptedException, Exception {
		r tp=new r();
		int total=1;
		int p=0;
		int ref=0;
		int ref1=0;
		String string="0";
		String pathname=new String();
		System.out.println("PLEASE ENTER PATH OF EXCEL FILE\nNAMEFILE IS ExcelSelenium.csv\n EXAMPLE FOR PATH C:/ExcelSelenium.csv");
		Scanner scanner = new Scanner(System. in);
		pathname=scanner.nextLine();
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20L,TimeUnit.SECONDS);
		driver.get("http://www.reifen.com/");		
		WebElement blocki=driver.findElement(By.xpath(".//*[@id='drpTyreWidth']"));
		List <WebElement> li=blocki.findElements(By.tagName("option"));
					
			for(int i=0;i<li.size();i++)
				{
					Thread.sleep(2000);
					Select sel1=new Select(driver.findElement(By.xpath(".//*[@id='drpTyreWidth']")));
					Thread.sleep(2000);
					sel1.selectByIndex(i);
					WebElement blockj=driver.findElement(By.xpath(".//*[@id='drpTyreCrossSection']"));
					Thread.sleep(2000);
					List <WebElement> lj=blockj.findElements(By.tagName("option"));
						if(ref==1)
						{
								Thread.sleep(1000);
								WebElement blocki1=driver.findElement(By.xpath(".//*[@id='drpTyreWidth']"));
								List <WebElement> li1=blocki1.findElements(By.tagName("option"));
								System.out.println(li1.get(i).getAttribute("value"));
						}	

							for(int j=0;j<lj.size();j++)
							{
								if(i>2)
								p=1;	
	
									switch(ref1)
									{
										case 0:{	
												Select sel2=new Select(driver.findElement(By.xpath(".//*[@id='drpTyreCrossSection']")));
												Thread.sleep(2000);
												sel2.selectByIndex(j);
												}break;
										case 1:{
												Select sel2j=new Select(driver.findElement(By.xpath(".//*[@id='drpTyreCrossSection']")));
												Select sel2i=new Select(driver.findElement(By.xpath(".//*[@id='drpTyreWidth']"))); 
												Thread.sleep(2000);
												sel2i.selectByIndex(i);
												Thread.sleep(2000);
												sel2j.selectByIndex(j);
											    }break;	
									
									}
								//System.out.println("index j \t"+(j+1)+" of "+lj.size() );
									switch(ref)
									{
									case 0:{
												System.out.println("\t\t\t"+lj.get(j).getAttribute("value"));
									        }break;			        
									case 1:{   
												Thread.sleep(1000);
												WebElement blockj1=driver.findElement(By.xpath(".//*[@id='drpTyreCrossSection']"));
												List <WebElement> lj1=blockj1.findElements(By.tagName("option"));
												System.out.println(lj1.get(j).getAttribute("value"));
											
											}break;
									}
									
									switch(p)
										{
											case 0:
												{
													Thread.sleep(3000);
													WebElement blockk=driver.findElement(By.id("drpTyreDiameter"));
													List <WebElement> lk;
													Thread.sleep(3000);
													lk=blockk.findElements(By.tagName("option"));
											for(int k=0;k<lk.size();k++)
											{
												WebElement kk = driver.findElement(By.xpath(".//*[@id='tyreCountContainer']/span"));
												Thread.sleep(3000);
												Thread.sleep(3000);
												System.out.println("\t\t\t"+lk.get(k).getAttribute("value"));
												Select sel3=new Select(driver.findElement(By.xpath(".//*[@id='drpTyreDiameter']")));
												Thread.sleep(2000);	
													if(i>2)
													{
														Thread.sleep(3000);	
														sel3.selectByIndex(k);
													}
												String value=kk.getText().toString();
													if(value.equals(string))
														{
															System.out.println("We dont have tires of this type");
														}
													else 
														{
															driver.findElement(By.xpath(".//*[@id='content-groesse']/div[3]/span[2]/button")).click();
															driver.get("http://www.reifen.com/");
														}
												}
										 }
										break;
									case 1:
										{
											Thread.sleep(5000);
											WebElement blockk=driver.findElement(By.id("drpTyreDiameter"));
											Thread.sleep(5000);
											List <WebElement> lk;
											Thread.sleep(5000);
											lk=blockk.findElements(By.tagName("option"));
											Thread.sleep(3000);	
											for(int k=0;k<lk.size();k++)
											{
												//System.out.println("index k \t"+(k+1)+" of "+lk.size());
													if(k>0)
														{
															Thread.sleep(3000);
															Select sel11=new Select(driver.findElement(By.xpath(".//*[@id='drpTyreWidth']")));
															sel11.selectByIndex(i);
															Select sel22=new Select(driver.findElement(By.xpath(".//*[@id='drpTyreCrossSection']")));
															Thread.sleep(3000);
															sel22.selectByIndex(j);
															WebElement blockk11=driver.findElement(By.id("drpTyreDiameter"));
															lk=blockk11.findElements(By.tagName("option"));
														}
												System.out.println("\t\t\t"+lk.get(k).getAttribute("value"));											
												Select sel3=new Select(driver.findElement(By.xpath(".//*[@id='drpTyreDiameter']")));
												sel3.selectByIndex(k);
												WebElement kk = driver.findElement(By.xpath(".//*[@id='tyreCountContainer']/span"));
												String value=kk.getText().toString();
													if(i>2)
														{
															Thread.sleep(3000);	
															sel3.selectByIndex(k);
															WebElement kk1 = driver.findElement(By.xpath(".//*[@id='tyreCountContainer']/span"));
															Thread.sleep(2000); //NEW LAST UPDATE
															int a=Integer.parseInt(driver.findElement(By.xpath(".//*[@id='tyreCountContainer']/span")).getText());//NEW LAST UPDATE
															 value=kk1.getText().toString();
														}
													if(value.equals(string))
														{
															System.out.println("We dont have tires of this type");
														}
													else 
														{
															Thread.sleep(2000); 
															int a=Integer.parseInt(driver.findElement(By.xpath(".//*[@id='tyreCountContainer']/span")).getText());;
															Thread.sleep(3000);
															driver.findElement(By.xpath(".//*[@id='hometab0']/div/ol/li[2]/a")).click();
															Thread.sleep(2000);
															driver.findElement(By.xpath(".//*[@id='content-groesse']/div[3]/span[2]/button")).click();
															Thread.sleep(2000);
															driver.findElement(By.xpath(".//*[@id='bottomArticleCount']/ul/li[3]/button")).click();
															WebElement kk1,kk2,kk3;
															String value1,value2,value3;
															Thread.sleep(2000);
														    System.out.println("INDEX\t\t\t\t\t\t"+"BRAND\t\t\t\t\t\t"+"PROFILE\t\t\t\t\t\t"+"PRIZE\t\t\t\t\t\t");
																    for(int n=1;n<=a;n++)
																	{
																	 kk3 = driver.findElement(By.xpath(".//*[@id='sprungTop']/div[2]/div/div[2]/div["+n+"]/div/div[2]/div/div[4]/div/form/div[3]/div[1]/div/p/span/span"));
																	 Thread.sleep(1000);
																	  try {
																		  File src=new File(pathname);
																		  FileInputStream fis=new FileInputStream(src);
																		   XSSFWorkbook wb=new XSSFWorkbook(fis);
																		   XSSFSheet sh1= wb.getSheetAt(0);
																		   XSSFRow excelRow ;
																		   XSSFCell excelCell1,excelCell2,excelCell3;
																		   excelRow = sh1.createRow(total); 
																		   
																		   kk1 = driver.findElement(By.xpath(".//*[@id='sprungTop']/div[2]/div/div[2]/div["+n+"]/div/div[2]/div/div[1]/p[2]"));
																		   value1=kk1.getText().toString();
																		   excelCell1 = excelRow.createCell(0);
																		   excelCell1.setCellValue(value1);
																		    
																		    kk2 = driver.findElement(By.xpath(".//*[@id='sprungTop']/div[2]/div/div[2]/div["+n+"]/div/div[2]/div/div[1]/p[3]")); 
																		    value2=kk2.getText().toString();
																		    excelCell2=excelRow.createCell(1);
																		    excelCell2.setCellValue(tp.getProfile(value2));
																		    
																			kk3 = driver.findElement(By.xpath(".//*[@id='sprungTop']/div[2]/div/div[2]/div["+n+"]/div/div[2]/div/div[4]/div/form/div[3]/div[1]/div/p/span/span"));
																			value3=kk3.getText().toString(); 
																		    excelCell3=excelRow.createCell(2);
																		    excelCell3.setCellValue(value3);
																		    System.out.println("INFOS OF TIRE NUMBER "+total+" IS ADDED TO ExcelSelenium.csv");
																		    total++;
																		  System.out.println(n+"\t\t\t\t\t\t"+value1+"\t\t\t\t\t\t"+value2+"\t\t\t\t\t\t"+value3);
																		  FileOutputStream fout=new FileOutputStream(new File(pathname)); 
																		  wb.write(fout);
																		  fout.close();
																		  wb.close();
																	}     catch (Exception e) {
																		    System.out.println(e.getMessage());
																		  }
																	  
																	}
															Thread.sleep(5000);
															driver.findElement(By.xpath("html/body/div[3]/div/div[5]/a/img")).click();
															ref=1;
															ref1=1;
															
														}
													}
												}
											break;
									}
								}
							}
						}
					 }