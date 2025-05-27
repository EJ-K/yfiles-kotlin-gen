// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.organic

import yfiles.lang.ClassMetadata
import yfiles.layout.IGroupBoundsCalculator
import yfiles.layout.ILayoutAlgorithm
import yfiles.layout.LayoutGraph
import yfiles.layout.LayoutStageBase

/**
 * This algorithm recursively removes node overlaps from a graph with a hierarchic group structure.
 * @see [ShuffleLayout]
 * @see [RecursiveGroupLayout][yfiles.layout.RecursiveGroupLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveShuffleLayout">Online Documentation</a>
 * 
 * @constructor Creates a new [RecursiveShuffleLayout] instance with an optional [core layout algorithm][LayoutStageBase.coreLayout].
 * @param [coreLayout] The core layout algorithm.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveShuffleLayout%23RecursiveShuffleLayout-constructor-RecursiveShuffleLayout">Online Documentation</a>
 */
external open class RecursiveShuffleLayout  ( coreLayout: ILayoutAlgorithm?  = definedExternally) : LayoutStageBase {

/**
 * Gets or sets the [IGroupBoundsCalculator] instance that computes the sizes of all group nodes.
 * 
 * Default value - [MinimumSizeGroupBoundsCalculator][yfiles.layout.MinimumSizeGroupBoundsCalculator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveShuffleLayout%23groupBoundsCalculator">Online Documentation</a>
 */
open var groupBoundsCalculator: IGroupBoundsCalculator?
/**
 * Gets or sets the [ILayoutAlgorithm] instance that is used for removing node overlaps.
 * 
 * Default value - [ShuffleLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveShuffleLayout%23shuffleLayout">Online Documentation</a>
 */
open var shuffleLayout: ILayoutAlgorithm?
/**
 * Removes all node overlaps in the given graph, after executing the specified [core layout algorithm][LayoutStageBase.coreLayout].
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RecursiveShuffleLayout%23RecursiveShuffleLayout-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )

companion object : ClassMetadata<RecursiveShuffleLayout> {
}
}

inline fun RecursiveShuffleLayout(
    block: RecursiveShuffleLayout.() -> Unit
): RecursiveShuffleLayout {
    return RecursiveShuffleLayout()
        .apply(block)
}
