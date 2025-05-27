// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.labeling

import yfiles.lang.ClassMetadata

/**
 * A generic labeling algorithm for placing the labels of a graph.
 * @see [LabelingBase]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLabeling">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [GenericLabeling] with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLabeling%23GenericLabeling-constructor-GenericLabeling">Online Documentation</a>
 */
external open class GenericLabeling  () : MISLabelingBase {

/**
 * Gets or sets whether or not this algorithm behaves deterministically.
 * 
 * Default value - `true`. Labeling results are deterministic.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLabeling%23deterministic">Online Documentation</a>
 */
open var deterministic: Boolean
/**
 * Gets or sets the time limit for this algorithm in milliseconds.
 * 
 * Default value - `<code>0x7FFFFFFF</code>`. There is no time limit.
 * @throws ArgumentError if the given maximum duration is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GenericLabeling%23maximumDuration">Online Documentation</a>
 */
open var maximumDuration: Int

companion object : ClassMetadata<GenericLabeling> {
}
}

inline fun GenericLabeling(
    block: GenericLabeling.() -> Unit
): GenericLabeling {
    return GenericLabeling()
        .apply(block)
}
