How to include the API with Maven:
`
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
<dependencies>
    <dependency>
        <groupId>com.github.TheDevTec</groupId>
        <artifactId>TheAPI-Shared</artifactId>
        <version>12.9.3</version>
        <scope>provided</scope>
    </dependency>
</dependencies>`
How to include the API with Gradle:
`
repositories {
    maven { url 'https://jitpack.io' }
}
dependencies {
    compileOnly "com.github.TheDevTec:TheAPI-Shared:12.9.3"
}`
