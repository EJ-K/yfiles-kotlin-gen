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
import yfiles.layout.ILayoutAlgorithm
import yfiles.layout.ILayoutStage
import yfiles.layout.LayoutGraph

/**
 * This [ILayoutStage] removes node overlaps and guarantees a certain minimum distance between nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RemoveOverlapsStage">Online Documentation</a>
 * 
 * @constructor Creates a new [RemoveOverlapsStage] instance with a given [minimum node distance][minimumNodeDistance].
 * @param [minimumNodeDistance] a non-negative minimum distance value
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RemoveOverlapsStage%23RemoveOverlapsStage-constructor-RemoveOverlapsStage">Online Documentation</a>
 * 
 * @property minimumNodeDistance
 * Gets or sets the minimum distance to be kept between any two nodes of the graph.
 * @throws ArgumentError if the given minimum distance is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RemoveOverlapsStage%23minimumNodeDistance">Online Documentation</a>
 */
external open class RemoveOverlapsStage  (
open var minimumNodeDistance: Double) : ILayoutStage {

/**
 * Gets or sets the core layout algorithm that is wrapped by this stage and is applied before removing node overlaps.
 * 
 * Default value - `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RemoveOverlapsStage%23coreLayout">Online Documentation</a>
 */
override var coreLayout: ILayoutAlgorithm?
/**
 * Removes node overlaps and displaces nodes of the given graph such that they keep the specified [minimum distance][minimumNodeDistance] to each other.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RemoveOverlapsStage%23RemoveOverlapsStage-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )

companion object : ClassMetadata<RemoveOverlapsStage> {
}
}
