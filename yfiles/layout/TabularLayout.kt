// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.Node
import yfiles.algorithms.NodeDpKey
import yfiles.collections.IComparer
import yfiles.lang.ClassMetadata

/**
 * This layout algorithm places nodes in a tabular fashion.
 * @see [PartitionGrid]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayout">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [TabularLayout] class with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayout%23TabularLayout-constructor-TabularLayout">Online Documentation</a>
 */
external open class TabularLayout  () : ILayoutAlgorithm {

/**
 * Gets or sets whether the algorithm should consider edges so that it tries to find a node arrangement with a low overall edge length.
 * 
 * Default value - `false`. Edges are not considered.
 * @see [layoutPolicy]
 * @see [nodeComparer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayout%23considerEdges">Online Documentation</a>
 */
open var considerEdges: Boolean
/**
 * Gets or sets whether or not the layout algorithm reserves space for node labels.
 * 
 * Default value - `true`. Node labels are considered.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayout%23considerNodeLabels">Online Documentation</a>
 */
open var considerNodeLabels: Boolean
/**
 * Gets or sets the [TabularNodeLayoutDescriptor] instance used for all the nodes that do not have an individual layout descriptor.
 * 
 * Default value - [TabularNodeLayoutDescriptor]. Descriptor instance with default settings.
 * @see [NODE_LAYOUT_DESCRIPTOR_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayout%23defaultNodeLayoutDescriptor">Online Documentation</a>
 */
open var defaultNodeLayoutDescriptor: TabularNodeLayoutDescriptor
/**
 * Gets or sets the policy defining the size of the resulting tabular layout and the mapping of the nodes to the table cells.
 * 
 * Default value - [TabularLayoutPolicy.AUTO_SIZE]
 * @throws ArgumentError if the given policy is unknown
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayout%23layoutPolicy">Online Documentation</a>
 */
open var layoutPolicy: TabularLayoutPolicy
/**
 * Gets or sets the time limit (in milliseconds) set for the layout algorithm.
 * 
 * Default value - `<code>0x7FFFFFFF</code>`. The layout algorithm runs unrestricted.
 * @throws ArgumentError if the maximum duration is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayout%23maximumDuration">Online Documentation</a>
 */
open var maximumDuration: Int
/**
 * Gets or sets the [IComparer] that defines the order in which the *free* nodes are placed in the table.
 * 
 * Default value - `null`. The nodes are sorted with respect to their indices of the graph structure.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayout%23nodeComparer">Online Documentation</a>
 */
open var nodeComparer: IComparer<in Node>?
/**
 * Arranges the input graph in a tabular fashion.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayout%23TabularLayout-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )

companion object : ClassMetadata<TabularLayout> {
/**
 * A data provider key for providing layout information for each node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TabularLayout%23NODE_LAYOUT_DESCRIPTOR_DP_KEY">Online Documentation</a>
 */
 val NODE_LAYOUT_DESCRIPTOR_DP_KEY: NodeDpKey<TabularNodeLayoutDescriptor>
}
}

inline fun TabularLayout(
    block: TabularLayout.() -> Unit
): TabularLayout {
    return TabularLayout()
        .apply(block)
}
