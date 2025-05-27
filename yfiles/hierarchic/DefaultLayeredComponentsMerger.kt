// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.lang.ClassMetadata
import yfiles.layout.LayoutGraph

/**
 * A default implementation of a [ILayeredComponentsMerger] that provides simple default behaviors.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLayeredComponentsMerger">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [DefaultLayeredComponentsMerger] using the given merging policy.
 * @param [policy] one of the predefined merging constants
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLayeredComponentsMerger%23DefaultLayeredComponentsMerger-constructor-DefaultLayeredComponentsMerger(MergingPolicy)">Online Documentation</a>
 * 
 * @property policy
 * Gets or sets the merging policy constant as defined in [DefaultLayeredComponentsMerger].
 * 
 * Default value - [MergingPolicy.ADD_RIGHT_TOP_ALIGNED]. Nodes of the source [layering][ILayers] are to the right of the target [layering][ILayers] and all nodes are top-aligned.
 * @throws ArgumentError if an unknown policy is given
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLayeredComponentsMerger%23policy">Online Documentation</a>
 */
external open class DefaultLayeredComponentsMerger  (
open var policy: MergingPolicy = definedExternally) : ILayeredComponentsMerger {

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLayeredComponentsMerger%23DefaultLayeredComponentsMerger-method-merge">Online Documentation</a>
 */
 override   fun merge( graph: LayoutGraph ,
 ldp: ILayoutDataProvider ,
 srcLayers: ILayers ,
 targetLayers: ILayers )

companion object : ClassMetadata<DefaultLayeredComponentsMerger> {
}
}

inline fun DefaultLayeredComponentsMerger(
    block: DefaultLayeredComponentsMerger.() -> Unit
): DefaultLayeredComponentsMerger {
    return DefaultLayeredComponentsMerger()
        .apply(block)
}
