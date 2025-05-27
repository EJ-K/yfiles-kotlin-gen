// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.partial

import yfiles.algorithms.NodeDpKey
import yfiles.algorithms.YRectangle
import yfiles.collections.IEnumerable
import yfiles.graph.IModelItem
import yfiles.lang.ClassMetadata
import yfiles.lang.Id
import yfiles.layout.ILayoutAlgorithm
import yfiles.layout.LayoutGraph

/**
 * This layout algorithm tries to fill a specified area with graph elements by moving nearby elements towards it, with the goal to make the existing layout more compact and not changing it too much.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayout">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [FillAreaLayout] with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayout%23FillAreaLayout-constructor-FillAreaLayout">Online Documentation</a>
 */
external open class FillAreaLayout  () : ILayoutAlgorithm {

/**
 * Gets or sets the rectangular area that should be filled.
 * 
 * Default value - `null`. There is no area to be filled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayout%23area">Online Documentation</a>
 */
open var area: YRectangle?
/**
 * Gets or sets the strategy that assigns nodes to components whose elements should preferably not be separated.
 * 
 * Default value - [ComponentAssignmentStrategy.CUSTOMIZED]. Components can be user-defined and if none are defined, each node is a separate component.
 * @throws ArgumentError if the specified strategy does not match one of the predefined strategies
 * @see [COMPONENT_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayout%23componentAssignmentStrategy">Online Documentation</a>
 */
open var componentAssignmentStrategy: ComponentAssignmentStrategy
/**
 * Gets or sets whether or not the layout algorithm considers edge labels.
 * 
 * Default value - `true`. Edge labels are considered.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayout%23considerEdgeLabels">Online Documentation</a>
 */
open var considerEdgeLabels: Boolean
/**
 * Gets or sets whether or not the layout algorithm considers node labels.
 * 
 * Default value - `true`. Node labels are considered.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayout%23considerNodeLabels">Online Documentation</a>
 */
open var considerNodeLabels: Boolean
/**
 * Gets or sets the current grid spacing.
 * 
 * Default value - `0`. No grid is considered.
 * @throws ArgumentError if the given spacing is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayout%23gridSpacing">Online Documentation</a>
 */
open var gridSpacing: Double
/**
 * Gets or sets the layout orientation that is considered during the compaction process.
 * 
 * Default value - [LayoutOrientation.NONE]. The layout is considered to have no specific orientation.
 * @throws ArgumentError if the specified orientation does not match one of the predefined orientations
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayout%23layoutOrientation">Online Documentation</a>
 */
open var layoutOrientation: LayoutOrientation
/**
 * Gets or sets the time limit in milliseconds for the layout algorithm.
 * 
 * Default value - `<code>0x7FFFFFFF</code>`
 * @throws ArgumentError if the maximum duration is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayout%23maximumDuration">Online Documentation</a>
 */
open var maximumDuration: Int
/**
 * Gets or sets the spacing that is considered between elements when they are moved.
 * 
 * Default value - `10`
 * @throws ArgumentError if the given spacing is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayout%23spacing">Online Documentation</a>
 */
open var spacing: Double
/**
 * Tries to fill the specified area in the given graph with elements, such that the resulting layout is more compact.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayout%23FillAreaLayout-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )
/**
 * Creates and sets the value of the property [area] of the `layout` determined from the `items`.
 * @param [items] The [IModelItem]s from which the rectangular area is determined.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayout%23FillAreaLayout-defaultmethod-configureAreaOutline">Online Documentation</a>
 */
   fun configureAreaOutline( items: IEnumerable<IModelItem> )

companion object : ClassMetadata<FillAreaLayout> {
/**
 * A data provider key for defining custom components whose elements should preferably not be separated.
 * @see [componentAssignmentStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayout%23COMPONENT_ID_DP_KEY">Online Documentation</a>
 */
 val COMPONENT_ID_DP_KEY: NodeDpKey<Id>
/**
 * A data provider key for marking nodes as fixed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FillAreaLayout%23FIXED_NODE_DP_KEY">Online Documentation</a>
 */
 val FIXED_NODE_DP_KEY: NodeDpKey<Boolean>
}
}

inline fun FillAreaLayout(
    block: FillAreaLayout.() -> Unit
): FillAreaLayout {
    return FillAreaLayout()
        .apply(block)
}
