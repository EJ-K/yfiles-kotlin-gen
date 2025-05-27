// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.lang.ClassMetadata

/**
 * A [BufferedLayout] is a hull algorithm that invokes its [core layout algorithm][LayoutStageBase.coreLayout] on a copy of the input graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BufferedLayout">Online Documentation</a>
 * 
 * @constructor Creates a new [BufferedLayout] instance using the given [core layout algorithm][LayoutStageBase.coreLayout].
 * @param [coreLayouter] the core layout routine
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BufferedLayout%23BufferedLayout-constructor-BufferedLayout">Online Documentation</a>
 */
external open class BufferedLayout  ( coreLayouter: ILayoutAlgorithm?  = definedExternally) : LayoutStageBase {

/**
 * Applies the layout calculated by the [core layout algorithm][LayoutStageBase.coreLayout] to the input graph.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BufferedLayout%23BufferedLayout-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )

companion object : ClassMetadata<BufferedLayout> {
}
}

inline fun BufferedLayout(
    block: BufferedLayout.() -> Unit
): BufferedLayout {
    return BufferedLayout()
        .apply(block)
}
