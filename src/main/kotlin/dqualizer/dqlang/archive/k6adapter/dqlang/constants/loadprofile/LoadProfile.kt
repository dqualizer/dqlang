package dqualizer.dqlang.archive.k6adapter.dqlang.constants.loadprofile

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Getter
import lombok.ToString

@Getter
@ToString
class LoadProfile {
    @JsonProperty("load_peak")
    private val loadPeak: LoadPeak? = null

    @JsonProperty("load_increase")
    private val loadIncrease: LoadIncrease? = null

    @JsonProperty("constant_load")
    private val constantLoad: ConstantLoad? = null
}
