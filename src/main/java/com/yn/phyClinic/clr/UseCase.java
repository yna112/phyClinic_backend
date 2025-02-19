package com.yn.phyClinic.clr;

import com.yn.phyClinic.beans.Patient;
import com.yn.phyClinic.beans.PatientForm;
import com.yn.phyClinic.beans.Therapy;
import com.yn.phyClinic.repo.PatientFormRepo;
import com.yn.phyClinic.repo.PatientRepository;
import com.yn.phyClinic.service.PatientFormService;
import com.yn.phyClinic.service.PatientService;
import com.yn.phyClinic.service.TherapyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;


@Component
@Order(1)
public class UseCase implements CommandLineRunner {

    @Autowired
    PatientRepository patientRepository;

    @Autowired
    TherapyService therapyService;
    @Autowired
    PatientFormRepo patientFormRepo;

    @Autowired
    PatientFormService patientFormService;

    @Autowired
    PatientService patientService;

    @Override
    public void run(String... args) throws Exception {

        Therapy t1= Therapy.builder()
                .therapyName("טיפול ידני")
                .date(Date.valueOf(LocalDate.now()))
                .time(LocalTime.of(9, 0))

                .build();

        Therapy t2= Therapy.builder()
                .therapyName( "טיפול אולטרה")
                .date(Date.valueOf(LocalDate.now().plusDays(2)))
                .time(LocalTime.of(10, 0))

                .build();


        Therapy t3= Therapy.builder()
                .therapyName("דיקור סיני")
                .date(Date.valueOf(LocalDate.now().plusDays(-3)))
                .time(LocalTime.of(14, 00))

                .build();



        Therapy t4= Therapy.builder()
                .therapyName("כוסות רוח")
                .date(Date.valueOf(LocalDate.now().plusDays(-2)))
                .time(LocalTime.of(9, 0))
                .build();



        Therapy t5= Therapy.builder()
                .therapyName("טיפול כללי")
                .date(Date.valueOf(LocalDate.now().plusDays(+1)))
                .time(LocalTime.of(13, 0))

                .build();


        Therapy t6= Therapy.builder()
                .therapyName("טיפול כללי")
                .date(Date.valueOf(LocalDate.now().plusDays(-1)))
                .time(LocalTime.of(9, 0))

                .build();



        Therapy t7= Therapy.builder()
                .therapyName("טיפול כללי")
                .date(Date.valueOf(LocalDate.now().plusDays(-1)))
                .time(LocalTime.of(10, 0))

                .build();




        Therapy t8= Therapy.builder()
                .therapyName("טיפול כללי")
                .date(Date.valueOf(LocalDate.now().plusDays(+2)))
                .time(LocalTime.of(12, 0))

                .build();


        Therapy t9= Therapy.builder()
                .therapyName("טיפול אבנים חמות")
                .date(Date.valueOf(LocalDate.now().plusDays(-3)))
                .time(LocalTime.of(12, 0))

                .build();

        Therapy t10= Therapy.builder()
                .therapyName("טיפול משולב")
                .date(Date.valueOf(LocalDate.now().plusDays(-1)))
                .time(LocalTime.of(12, 0))

                .build();

        Therapy t11= Therapy.builder()
                .therapyName("טיפול מונע")
                .date(Date.valueOf(LocalDate.now().plusDays(+1)))
                .time(LocalTime.of(12, 0))

                .build();




        Therapy t12= Therapy.builder()
                .therapyName("טיפול מקומי")
                .date(Date.valueOf(LocalDate.now()))
                .time(LocalTime.of(12, 0))

                .build();

        Therapy t13= Therapy.builder()
                .therapyName("טיפול בדיקה")
                .date(Date.valueOf(LocalDate.now()))
                .time(LocalTime.of(12, 0))

                .build();

        Therapy t14= Therapy.builder()
                .therapyName("דיקור אוסטרלי")
                .date(Date.valueOf(LocalDate.now().plusDays(6)))
                .time(LocalTime.of(12, 0))

                .build();


        Therapy t15= Therapy.builder()
                .therapyName("דיקור יפני")
                .date(Date.valueOf(LocalDate.now().plusDays(7)))
                .time(LocalTime.of(12, 0))

                .build();




        Patient p1=Patient.builder()
                .city("קרית אונו")
                .phoneNumber("053-6231249")
                .mail("davidt@gmail.com")
                .age(30)
                .firstName("דוד")
                .lastName("טל")
                .height(175)
                .weight(70)
                .build();

        Patient p2=Patient.builder()
                .city("מודיעין")
                .mail("gillevi@gmail.com")
                .phoneNumber("052-9489221")
                .age(54)
                .firstName("גיל")
                .lastName("לוי")
                .height(172)
                .weight(85)
                .build();





        Patient p3=Patient.builder()
                .city("קרית אונו")
                .mail("dudibal@gmail.com")
                .phoneNumber("050-4899348")
                .age(30)
                .firstName("דודי")
                .lastName("בלסר")
                .height(175)
                .weight(70)
                .build();

        Patient p4=Patient.builder()
                .city("פתח תקווה")
                .age(44)
                .phoneNumber("050-3443198")
                .mail("sigalar@gmail.com")
                .firstName("סיגל")
                .lastName("ערד")
                .height(158)
                .weight(60)
                .build();


        Patient p5=Patient.builder()
                .city("ירושלים")
                .age(63)
                .phoneNumber("055-987567")
                .firstName("הדר")
                .lastName("לוין")
                .mail("hadarlevin@gmail.com")
                .height(161)
                .weight(70)
                .build();

        Patient p6=Patient.builder()
                .city("תל אביב")
                .age(34)
                .firstName("שלומי")
                .lastName("בנין")
                .phoneNumber("054-8889865")
                .mail("shlomibanin@gmail.com")
                .height(178)
                .weight(82)
                .build();

        Patient p7=Patient.builder()
                .city("תל מונד")
                .mail("dvirgan@gmail.com")
                .age(51)
                .firstName("דביר")
                .phoneNumber("053-7654851")
                .lastName("גץ")
                .height(182)
                .weight(77)
                .build();

        Patient p8=Patient.builder()
                .city("גבעת שמואל")
                .age(48)
                .mail("ifatshemesh@gmail.com")
                .phoneNumber("050-4325221")
                .firstName("יפעת")
                .lastName("שמש")
                .height(160)
                .weight(58)
                .build();

        Patient p9=Patient.builder()
                .city("לוד")
                .age(65)
                .firstName("אילנית")
                .mail("ilanit@gmail.com")
                .phoneNumber("052-9098621")
                .lastName("חביב")
                .height(163)
                .weight(70)
                .build();

        Patient p10=Patient.builder()
                .city("רמת גן")
                .phoneNumber("054-8986542")
                .mail("daniroz@gmail.com")
                .age(28)
                .firstName("דניאל")
                .lastName("רוזן")
                .height(178)
                .weight(73)
                .build();

        Patient p11=Patient.builder()
                .city("בני ברק")
                .mail("ahdiam@gmail.com")
                .phoneNumber("053-5674107")
                .age(50)
                .firstName("אהרון")
                .lastName("דיאמנט")
                .height(177)
                .weight(78)
                .build();

        Patient p12=Patient.builder()
                .city("נחלים")
                .age(57)
                .phoneNumber("052-8845420")
                .firstName("דליה")
                .mail("daliagab@gmail.com")
                .lastName("גבאי")
                .height(162)
                .weight(60)
                .build();
        Patient p13=Patient.builder()
                .city("ראש העין")
                .phoneNumber("054-9802215")
                .age(49)
                .mail("amosoz@gmail.com")
                .firstName("עמוס")
                .lastName("עוז")
                .height(165)
                .weight(70)
                .build();

        Patient p14=Patient.builder()
                .city("חולון")
                .mail("keren@gmail.com")
                .age(31)
                .firstName("קרן")
                .phoneNumber("054-2128942")
                .lastName("שוורץ")
                .height(170)
                .weight(70)
                .build();

        Patient p15=Patient.builder()
                .city("בית שמש")
                .mail("dolevargaman@gmail.com")
                .phoneNumber("050-5674412")
                .age(41)
                .firstName("דולב")
                .lastName("ארגמן")
                .height(176)
                .weight(71)
                .build();
        Patient p16 = Patient.builder()
                .city("ירושלים")
                .age(45)
                .firstName("רות")
                .lastName("כהן")
                .phoneNumber("054-5551234")
                .mail("rutcohen@gmail.com")
                .height(165)
                .weight(62)
                .build();

        Patient p17 = Patient.builder()
                .city("חיפה")
                .age(36)
                .firstName("יוסי")
                .lastName("שבתאי")
                .phoneNumber("050-7896541")
                .mail("yosishab@gmail.com")
                .height(180)
                .weight(80)
                .build();

        Patient p18 = Patient.builder()
                .city("אשדוד")
                .age(29)
                .firstName("מאיה")
                .lastName("לביא")
                .phoneNumber("052-6547893")
                .mail("mayalevi@gmail.com")
                .height(168)
                .weight(64)
                .build();

        Patient p19 = Patient.builder()
                .city("הרצליה")
                .age(53)
                .firstName("ארז")
                .lastName("מזרחי")
                .phoneNumber("054-4567892")
                .mail("erezmiz@gmail.com")
                .height(175)
                .weight(76)
                .build();

        Patient p20 = Patient.builder()
                .city("פתח תקווה")
                .age(40)
                .firstName("ליאור")
                .lastName("ברק")
                .phoneNumber("053-9876543")
                .mail("liorbarak@gmail.com")
                .height(172)
                .weight(75)
                .build();

        Patient p21 = Patient.builder()
                .city("נתניה")
                .age(34)
                .firstName("אורית")
                .lastName("גל")
                .phoneNumber("050-1234567")
                .mail("oritgal@gmail.com")
                .height(160)
                .weight(58)
                .build();

        Patient p22 = Patient.builder()
                .city("רחובות")
                .age(61)
                .firstName("חיים")
                .lastName("רוזנבלום")
                .phoneNumber("052-9871234")
                .mail("haimroz@gmail.com")
                .height(168)
                .weight(72)
                .build();

        Patient p23 = Patient.builder()
                .city("כפר סבא")
                .age(38)
                .firstName("איילת")
                .lastName("שפירא")
                .phoneNumber("054-6543210")
                .mail("ayaletshap@gmail.com")
                .height(162)
                .weight(60)
                .build();

        Patient p24 = Patient.builder()
                .city("רעננה")
                .age(47)
                .firstName("גדעון")
                .lastName("קפלן")
                .phoneNumber("053-7654321")
                .mail("gidonk@gmail.com")
                .height(174)
                .weight(73)
                .build();

        Patient p25 = Patient.builder()
                .city("מודיעין")
                .age(32)
                .firstName("נועה")
                .lastName("אלקיים")
                .phoneNumber("052-2345678")
                .mail("noaelk@gmail.com")
                .height(158)
                .weight(55)
                .build();

        Patient p26 = Patient.builder()
                .city("אילת")
                .age(59)
                .firstName("אבי")
                .lastName("בן דוד")
                .phoneNumber("054-3210987")
                .mail("avibd@gmail.com")
                .height(177)
                .weight(78)
                .build();

        Patient p27 = Patient.builder()
                .city("נהריה")
                .age(25)
                .firstName("חן")
                .lastName("צור")
                .phoneNumber("053-8765432")
                .mail("henzur@gmail.com")
                .height(170)
                .weight(65)
                .build();

        Patient p28 = Patient.builder()
                .city("כרמיאל")
                .age(52)
                .firstName("מרים")
                .lastName("זליג")
                .phoneNumber("050-5678901")
                .mail("miriamz@gmail.com")
                .height(163)
                .weight(68)
                .build();

        Patient p29 = Patient.builder()
                .city("רמת השרון")
                .age(44)
                .firstName("רוני")
                .lastName("לוי")
                .phoneNumber("054-4321098")
                .mail("ronilevi@gmail.com")
                .height(178)
                .weight(80)
                .build();

        Patient p30 = Patient.builder()
                .city("יבנה")
                .age(39)
                .firstName("גלית")
                .lastName("פרידמן")
                .phoneNumber("052-3456789")
                .mail("galitf@gmail.com")
                .height(160)
                .weight(60)
                .build();

        Patient p31 = Patient.builder()
                .city("בת ים")
                .age(27)
                .firstName("אופיר")
                .lastName("כהן")
                .phoneNumber("053-1230987")
                .mail("ofirk@gmail.com")
                .height(180)
                .weight(82)
                .build();

        Patient p32 = Patient.builder()
                .city("עפולה")
                .age(55)
                .firstName("דליה")
                .lastName("רון")
                .phoneNumber("050-6548901")
                .mail("daliaron@gmail.com")
                .height(165)
                .weight(67)
                .build();

        Patient p33 = Patient.builder()
                .city("נס ציונה")
                .age(46)
                .firstName("גיא")
                .lastName("עוזרי")
                .phoneNumber("054-8765432")
                .mail("guyo@gmail.com")
                .height(175)
                .weight(79)
                .build();

        Patient p34 = Patient.builder()
                .city("טבריה")
                .age(42)
                .firstName("רונית")
                .lastName("אלמוג")
                .phoneNumber("052-5671234")
                .mail("ronital@gmail.com")
                .height(164)
                .weight(62)
                .build();

        Patient p35 = Patient.builder()
                .city("אשקלון")
                .age(37)
                .firstName("יניב")
                .lastName("אבידן")
                .phoneNumber("053-9876541")
                .mail("yaniva@gmail.com")
                .height(179)
                .weight(83)
                .build();

        Patient p36 = Patient.builder()
                .city("באר שבע")
                .age(31)
                .firstName("דנה")
                .lastName("פורת")
                .phoneNumber("054-5678902")
                .mail("danap@gmail.com")
                .height(161)
                .weight(59)
                .build();

        Patient p37 = Patient.builder()
                .city("קרית אונו")
                .age(60)
                .firstName("שמואל")
                .lastName("ברקוביץ")
                .phoneNumber("050-7891234")
                .mail("shmuelb@gmail.com")
                .height(173)
                .weight(74)
                .build();

        Patient p38 = Patient.builder()
                .city("ראשון לציון")
                .age(33)
                .firstName("אורנה")
                .lastName("ממן")
                .phoneNumber("053-1234568")
                .mail("ornam@gmail.com")
                .height(159)
                .weight(57)
                .build();

        Patient p39 = Patient.builder()
                .city("קרית גת")
                .age(49)
                .firstName("לירון")
                .lastName("בוזגלו")
                .phoneNumber("054-8765433")
                .mail("lironb@gmail.com")
                .height(174)
                .weight(75)
                .build();

        Patient p40 = Patient.builder()
                .city("שדרות")
                .age(35)
                .firstName("אורן")
                .lastName("מזרחי")
                .phoneNumber("052-7891235")
                .mail("orenmiz@gmail.com")
                .height(170)
                .weight(72)
                .build();

        Patient p41 = Patient.builder()
                .city("קרית שמונה")
                .age(58)
                .firstName("אתי")
                .lastName("הרוש")
                .phoneNumber("050-6543212")
                .mail("etih@gmail.com")
                .height(164)
                .weight(63)
                .build();

        Patient p42 = Patient.builder()
                .city("רמלה")
                .age(30)
                .firstName("אדם")
                .lastName("סבן")
                .phoneNumber("053-9871235")
                .mail("adams@gmail.com")
                .height(182)
                .weight(85)
                .build();

        PatientForm patientForm1=PatientForm.builder()
                .firstName(p1.getFirstName())
                .lastName(p1.getLastName())
                .city("תל אביב")
                .address("ההר הגבוה 10")
                .phoneNumber("050-1234567")
                .mail("yossi@example.com")
                .gender("זכר")
                .weight(80)
                .height(180)
                .occupation("מהנדס")
                .hasInsurance("כן")
                .insuranceCompanyName("מגדל")
                .insuranceExpiryDate("31/12/2025")
                .insuranceCoverageType("מלא")
                .isPhysicallyActive("כן")
                .reasonForPhysiotherapy("כאב בגב")
                .mainComplaint("כאבים בגב התחתון")
                .secondaryComplaint("קשיי תנועה")
                .painDuration("שבועיים")
                .isPregnant("yes")
                .pregnancyWeek(0)
                .isBreastfeeding("לא")
                .painLevel(7)
                .patient(p1)

                .build();







        patientRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p16,p17,p18,p19,p20,p21,p22,p23,p24,p25,p26,p27,p28,p29
                ,p30,p31,p32,p33,p34,p35,p36,p37,p38,p39,p40,p41,p42 ));

        therapyService.createNewTherapy(t1,3);
        therapyService.createNewTherapy(t2,3);
        therapyService.createNewTherapy(t3,3);
        therapyService.createNewTherapy(t4,3);
        therapyService.createNewTherapy(t5,1);
        therapyService.createNewTherapy(t6,1);
        therapyService.createNewTherapy(t7,2);
        therapyService.createNewTherapy(t8,4);
        therapyService.createNewTherapy(t9,6);
        therapyService.createNewTherapy(t10,6);
        therapyService.createNewTherapy(t11,4);
        therapyService.createNewTherapy(t12,2);
        therapyService.createNewTherapy(t13,2);
        therapyService.createNewTherapy(t14,4);
        therapyService.createNewTherapy(t15,1);



        patientFormService.createNewForm(patientForm1,p1.getId());




        System.out.println("========================================================================");
        System.out.println("========================================================================");
        System.out.println("========================================================================");
        System.out.println(therapyService.getTherapiesByPatientId(3));
        System.out.println(therapyService.getTherapyByTherapyId(1).getDate());

                System.out.println("========================================================================");
        System.out.println("========================================================================");
        System.out.println("========================================================================");
        System.out.println("========================================================================");
        System.out.println("========================================================================");
        System.out.println("========================================================================");
        System.out.println(patientService.getPatientById(1));








    }
}
