package io.github.dqualizer.dqlang.data

import org.springframework.core.convert.converter.Converter
import org.springframework.data.convert.ReadingConverter
import org.springframework.data.convert.WritingConverter
import java.lang.module.ModuleDescriptor.Version

@ReadingConverter
class VersionReadConverter : Converter<String, Version> {
    override fun convert(sourceStr: String): Version {
        return Version.parse(sourceStr)
    }
}

@WritingConverter
class VersionWriteConverter : Converter<Version, String> {
    override fun convert(version: Version): String {
        return version.toString()
    }
}
