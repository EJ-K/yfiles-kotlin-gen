// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import js.array.ReadonlyArray
import yfiles.algorithms.EdgeList
import yfiles.algorithms.INodeMap
import yfiles.algorithms.NodeDpKey
import yfiles.algorithms.NodeList
import yfiles.algorithms.Rectangle2D
import yfiles.algorithms.YDimension
import yfiles.algorithms.YPoint
import yfiles.algorithms.YRectangle
import yfiles.lang.ClassMetadata
import yfiles.lang.IComparable

/**
 * A [ComponentLayout] arranges the connected components of a graph.
 * @see [MultiStageLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayout">Online Documentation</a>
 * 
 * @constructor Creates a new [ComponentLayout] instance with an optional [core layout algorithm][LayoutStageBase.coreLayout].
 * @param [coreLayout] The core layout algorithm.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayout%23ComponentLayout-constructor-ComponentLayout">Online Documentation</a>
 */
external open class ComponentLayout  ( coreLayout: ILayoutAlgorithm?  = definedExternally) : LayoutStageBase {

/**
 * Gets or sets whether or not the separately arranged components of the input graph should be arranged relative to each other.
 * 
 * Default value - `true`. The components are arranged relative to each other.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayout%23componentArrangement">Online Documentation</a>
 */
open var componentArrangement: Boolean
/**
 * Gets or sets the distance between the bounding boxes of the components.
 * 
 * Default value - `45`
 * @throws ArgumentError if the spacing is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayout%23componentSpacing">Online Documentation</a>
 */
open var componentSpacing: Double
/**
 * Gets or sets whether or not grouping information bound to the graph should be considered when determining the graph components.
 * 
 * Default value - `true`. Grouping information is considered for determining the components.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayout%23considerGrouping">Online Documentation</a>
 */
open var considerGrouping: Boolean
/**
 * Gets or sets whether or not to take node and edge labels into account when calculating the bounding box of the graph components.
 * 
 * Default value - `true`. Node and edge labels are included in the bounds of the components.
 * @see [calculateBounds]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayout%23considerLabels">Online Documentation</a>
 */
open var considerLabels: Boolean
/**
 * Gets or sets the current grid spacing.
 * 
 * Default value - `0`. No grid is considered.
 * @throws ArgumentError if the given spacing is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayout%23gridSpacing">Online Documentation</a>
 */
open var gridSpacing: Double
/**
 * Gets or sets the preferred size of the layout.
 * 
 * Default value - [YDimension]. Both preferred width and height are `400`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayout%23preferredSize">Online Documentation</a>
 */
open var preferredSize: YDimension
/**
 * Gets or sets how the components are arranged.
 * 
 * Default value - [ComponentArrangementStyles.ROWS]
 * @throws ArgumentError if the specified style is unknown
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayout%23style">Online Documentation</a>
 */
open var style: ComponentArrangementStyles
/**
 * Delegates the layout calculation for each component separately to the [core layout algorithm][LayoutStageBase.coreLayout] and optionally arranges the components.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayout%23ComponentLayout-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )
/**
 * Produces a component graph layout.
 * @param [graph] the input graph
 * @param [nodes] the nodes of the components; the i-th list contains the nodes of the i-th component
 * @param [edges] the edges of the components; the i-th list contains the edges of the i-th component
 * @param [bbox] the bounds of the components; the i-th rectangle describes the bounding box of the i-th component
 * @param [boxes] the extended bounds of the components; the i-th rectangle describes the bounding box of the i-th component extended by the spacing between components. The method arranges these boxes in such a way that they do not overlap. Then, the i-th graph component must be placed inside the i-th box
 * @see [arrangeFields]
 * @see [LayoutGraphUtilities.arrangeRectangleRows]
 * @see [LayoutGraphUtilities.arrangeRectangleMultiRows]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayout%23ComponentLayout-method-arrangeComponents">Online Documentation</a>
 */
 open protected   fun arrangeComponents( graph: LayoutGraph ,
 nodes: ReadonlyArray<NodeList> ,
 edges: ReadonlyArray<EdgeList> ,
 bbox: ReadonlyArray<YRectangle> ,
 boxes: ReadonlyArray<Rectangle2D> )
/**
 * Arranges the bounding boxes of the components.
 * @param [graph] the input graph
 * @param [nodes] the nodes of the components; the i-th list contains the nodes of the i-th component
 * @param [edges] the edges of the components; the i-th list contains the edges of the i-th component
 * @param [bbox] the bounds of the components; the i-th rectangle describes the bounding box of the i-th component
 * @param [boxes] the extended bounds of the components; the i-th rectangle describes the bounding box of the i-th component
 * @param [circular] `true` if the arrangement should be circular, `false` if it should be rectangular
 * @param [fill] `true` if it is allowed to place components in empty spaces *inside other
 *    components*, `false` otherwise
 * @param [fromSketch] `true` if the initial coordinates should be considered, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayout%23ComponentLayout-method-arrangeFields">Online Documentation</a>
 */
 open protected   fun arrangeFields( graph: LayoutGraph ,
 nodes: ReadonlyArray<NodeList> ,
 edges: ReadonlyArray<EdgeList> ,
 bbox: ReadonlyArray<YRectangle> ,
 boxes: ReadonlyArray<Rectangle2D> ,
 circular: Boolean ,
 fill: Boolean ,
 fromSketch: Boolean )
/**
 * Calculates the bounding box of a graph component including [NodeHalo]s.
 * @param [graph] the subgraph containing the nodes and edges of a component
 * @return the bounding box of the component
 * @see [considerLabels]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayout%23ComponentLayout-method-calculateBounds">Online Documentation</a>
 */
 open protected   fun calculateBounds( graph: LayoutGraph ):Rectangle2D
/**
 * Determines which nodes belong to the same graph component.
 * @param [graph] the input graph
 * @param [compNumber] a map that will be filled with the zero-based index of the component to which the node belongs
 * @return the number of connected components of this graph
 * @see [GraphConnectivity.connectedComponents][yfiles.algorithms.GraphConnectivity.connectedComponents]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayout%23ComponentLayout-method-findGraphComponents">Online Documentation</a>
 */
 open protected   fun findGraphComponents( graph: LayoutGraph ,
 compNumber: INodeMap<Int> ):Int
/**
 * Moves the subgraph containing the given nodes and edges to the specified origin.
 * @param [graph] the input graph
 * @param [nodes] the nodes in the moving subgraph
 * @param [edges] the edges in the moving subgraph
 * @param [origin] the new origin of the graph
 * @param [rectangle] the current bounds of the subgraph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayout%23ComponentLayout-method-setOrigin">Online Documentation</a>
 */
 open protected   fun setOrigin( graph: LayoutGraph ,
 nodes: NodeList ,
 edges: EdgeList ,
 origin: YPoint ,
 rectangle: YRectangle )

companion object : ClassMetadata<ComponentLayout> {
/**
 * A data provider key for specifying which nodes should be arranged.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayout%23AFFECTED_COMPONENTS_DP_KEY">Online Documentation</a>
 */
 val AFFECTED_COMPONENTS_DP_KEY: NodeDpKey<Boolean>
/**
 * A data provider key for specifying custom graph components.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentLayout%23COMPONENT_ID_DP_KEY">Online Documentation</a>
 */
 val COMPONENT_ID_DP_KEY: NodeDpKey<IComparable<*>>
}
}

inline fun ComponentLayout(
    block: ComponentLayout.() -> Unit
): ComponentLayout {
    return ComponentLayout()
        .apply(block)
}
