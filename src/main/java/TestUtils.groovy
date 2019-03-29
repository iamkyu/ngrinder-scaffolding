import org.codehaus.groovy.reflection.ReflectionUtils

class TestUtils {
    static loadResourceReaderFromClassPath(String resourcePath) {
        InputStream inputStream = ReflectionUtils.getCallingClass(0).getResourceAsStream(resourcePath)
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))
        return reader
    }
}
