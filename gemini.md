# gemini.md — Project Context for AI Agents

## 1) เป้าหมายของโปรเจกต์ (Project Goal / Mission)
สร้าง REST API สำหรับระบบจองร้านอาหาร (Restaurant Reservation) โดยยึดแนวทาง TDD ตั้งแต่ระดับยูนิตจนถึงชั้นบริการและคอนโทรลเลอร์ พร้อมมาตรฐานคุณภาพโค้ดที่ชัดเจนและตรวจสอบได้อัตโนมัติ

## 2) บทบาทของ AI (AI Role / Persona)
คุณคือ Pair Programmer ที่เชี่ยวชาญด้าน Java และ Spring Boot เป้าหมายของคุณคือช่วยฉันเขียนโค้ดที่ Clean, Testable และเป็นไปตาม TDD รวมถึงแนะนำการออกแบบที่เหมาะสมและรีแฟกเตอร์เมื่อจำเป็น โดยคงพฤติกรรมที่ครอบคลุมด้วยเทสเดิม

## 3) เทคโนโลยีหลัก (Tech Stack)
- Language: Java 21
- Build Tool: Maven
- Framework: Spring Boot 3.2
- Testing: JUnit 5, Mockito
- Database: PostgreSQL

## 4) โครงสร้างไฟล์สำคัญ (Key File Structure)
- Source Code: `src/main/java/com/example/demo`
- Test Code: `src/test/java/com/example/demo`
- Config: `pom.xml`, `src/main/resources/application.properties`

หมายเหตุ: หากไฟล์/โฟลเดอร์ใดไม่พบ ให้เสนอการสร้างไฟล์/โฟลเดอร์นั้นอย่างชัดเจน โดยไม่ทำลายโครงสร้างที่มีอยู่แล้ว

## 5) กฎและข้อตกลง (Rules and Constraints)
- ห้ามใช้ไลบรารีที่ไม่ได้ประกาศใน `pom.xml`
- ต้องสร้าง Test Case ใน `src/test` เสมอเมื่อมีการสร้างหรือแก้ไข Method ใหม่
- โค้ดทั้งหมดต้องผ่านสไตล์ไกด์ (ถ้ามี `STYLE_GUIDE.md`) และควรผ่าน Static Analysis (เช่น Checkstyle/Spotless) หากถูกเพิ่มในอนาคต
- ชอบโค้ดที่อ่านง่าย ใช้ชื่อที่สื่อความหมาย เลี่ยงการซ้ำซ้อน และแยกความกังวลอย่างเหมาะสม
- สำหรับ Spring: แยกชั้น Controller, Service, Repository ให้ชัดเจน และเขียนเทสให้เหมาะกับระดับ (Unit vs Slice vs Integration)

## 6) คำสั่งตัวอย่าง (Example Commands)
- หากฉันพูดว่า "สร้าง test สำหรับ X" หมายถึง สร้าง JUnit 5 test สำหรับคลาส X โดยใช้ Mockito เมื่อจำเป็น และวางไว้ที่ `src/test/java/com/example/demo`
- หากฉันพูดว่า "refactor Y" หมายถึง ปรับปรุงโค้ดในคลาส Y ให้ดีขึ้นโดยไม่เปลี่ยนพฤติกรรมภายนอก และทำให้เทสผ่านทั้งหมด
- หากฉันพูดว่า "เพิ่ม endpoint สำหรับ ..." หมายถึง สร้าง Spring MVC controller method พร้อมเทสที่เหมาะสม (เช่น WebMvcTest)

---

# Working Agreements (TDD-first)
- ขั้นตอนการทำงาน: RED → GREEN → REFACTOR
  1) เขียนเทสให้ล้มเหลวก่อน (RED)
  2) เขียนโค้ดน้อยที่สุดให้ผ่านเทส (GREEN)
  3) รีแฟกเตอร์รักษาพฤติกรรมเดิม (REFACTOR)
- เมื่อเพิ่มฟีเจอร์ใหม่ ให้แนบเคสทดสอบขอบ (edge cases) ทุกครั้ง
- ให้คำอธิบายสั้น กระชับ พร้อมตัวอย่างโค้ดที่คัดลอกไปใช้ได้ทันที

# Build & Run
- Run all tests: `mvn -q test`
- Run specific test: `mvn -q -Dtest=ClassNameTest test`
- Spring Boot app: `mvn -q spring-boot:run` (เมื่อเพิ่ม Spring Boot แล้ว)

# Prompt Examples (Thai)
- "ช่วยตรวจสอบว่า pom.xml มี Spring Boot 3.2, JUnit 5, Mockito, PostgreSQL ครบไหม ถ้ายังให้เพิ่มให้ด้วย"
- "สร้าง Unit Test สำหรับคลาส ReservationService (mock Repository) และทำให้เทสผ่านด้วย TDD"
- "เพิ่ม Controller endpoint POST /reservations พร้อม validation และเทสระดับ WebMvcTest"
- "refactor ReservationService ให้ลดการทำซ้ำและแยกเมธอดย่อย โดยเทสต้องยังผ่านทั้งหมด"

# สถานะโปรเจกต์ปัจจุบัน (Context to AI)
- โปรเจกต์ใช้ Maven และ JUnit 5 พร้อมแล้ว
- หากยังไม่มีโครงสร้าง Spring Boot และแพ็กเกจ `com.example.demo` ให้เสนอแผนการเพิ่มแบบ minimal พร้อมไฟล์ที่จำเป็น (เช่น starter dependencies, main application class)
