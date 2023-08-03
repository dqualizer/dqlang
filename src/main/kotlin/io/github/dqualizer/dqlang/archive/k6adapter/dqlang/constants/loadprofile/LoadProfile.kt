package io.github.dqualizer.dqlang.archive.k6adapter.dqlang.constants.loadprofile

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Getter
import lombok.ToString

@Getter
@ToString
class LoadProfile {
    @JsonProperty("load_peak")
    val loadPeak: io.github.dqualizer.dqlang.archive.k6adapter.dqlang.constants.loadprofile.LoadPeak? = null

    @JsonProperty("load_increase")
    val loadIncrease: io.github.dqualizer.dqlang.archive.k6adapter.dqlang.constants.loadprofile.LoadIncrease? = null

    @JsonProperty("constant_load")
    val constantLoad: io.github.dqualizer.dqlang.archive.k6adapter.dqlang.constants.loadprofile.ConstantLoad? = null
}
