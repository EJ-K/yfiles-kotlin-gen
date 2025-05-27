// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.organic

import yfiles.algorithms.NodeDpKey
import yfiles.lang.ClassMetadata
import yfiles.layout.ILayoutAlgorithm
import yfiles.layout.LayoutGraph
import yfiles.layout.LayoutStageBase

/**
 * This layout stage removes node overlaps while changes to the original layout structure are avoided and a specified minimum node distance is guaranteed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicRemoveOverlapsStage">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [OrganicRemoveOverlapsStage] with an optional [core layout algorithm][LayoutStageBase.coreLayout].
 * @param [coreLayout] The core layout algorithm.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicRemoveOverlapsStage%23OrganicRemoveOverlapsStage-constructor-OrganicRemoveOverlapsStage">Online Documentation</a>
 */
external open class OrganicRemoveOverlapsStage  ( coreLayout: ILayoutAlgorithm?  = definedExternally) : LayoutStageBase {

/**
 * Gets or sets the maximum duration in milliseconds that this layout stage is allowed to run.
 * 
 * Default value - `<code>0x7FFFFFFF</code>`
 * @throws ArgumentError if the specified duration has a negative value
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicRemoveOverlapsStage%23maximumDuration">Online Documentation</a>
 */
open var maximumDuration: Int
/**
 * Gets or sets the minimum distance to be kept between any two nodes of the graph.
 * 
 * Default value - `10`
 * @throws ArgumentError if the given minimum distance is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicRemoveOverlapsStage%23minimumNodeDistance">Online Documentation</a>
 */
open var minimumNodeDistance: Double
/**
 * Removes node overlaps and displaces nodes of the given graph such that they keep the specified [minimum distance][minimumNodeDistance] to each other.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicRemoveOverlapsStage%23OrganicRemoveOverlapsStage-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )

companion object : ClassMetadata<OrganicRemoveOverlapsStage> {
/**
 * A data provider key for marking nodes as fixed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicRemoveOverlapsStage%23FIXED_NODE_DP_KEY">Online Documentation</a>
 */
 val FIXED_NODE_DP_KEY: NodeDpKey<Boolean>
}
}

inline fun OrganicRemoveOverlapsStage(
    block: OrganicRemoveOverlapsStage.() -> Unit
): OrganicRemoveOverlapsStage {
    return OrganicRemoveOverlapsStage()
        .apply(block)
}
