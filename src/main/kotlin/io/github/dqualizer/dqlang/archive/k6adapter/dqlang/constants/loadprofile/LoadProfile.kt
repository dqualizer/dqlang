package io.github.dqualizer.dqlang.archive.k6adapter.dqlang.constants.loadprofile

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Getter
import lombok.ToString

@Getter
@ToString
class LoadProfile {
    @JsonProperty("load_peak")
    private val loadPeak: io.github.dqualizer.dqlang.archive.k6adapter.dqlang.constants.loadprofile.LoadPeak? = null

    @JsonProperty("load_increase")
    private val loadIncrease: io.github.dqualizer.dqlang.archive.k6adapter.dqlang.constants.loadprofile.LoadIncrease? = null

    @JsonProperty("constant_load")
    private val constantLoad: io.github.dqualizer.dqlang.archive.k6adapter.dqlang.constants.loadprofile.ConstantLoad? = null
}
