// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

import yfiles.algorithms.Edge
import yfiles.algorithms.IDataMap
import yfiles.algorithms.IDataProvider
import yfiles.algorithms.Node
import yfiles.collections.IComparer
import yfiles.lang.ClassMetadata
import yfiles.layout.LayoutGraph

/**
 * The [DendrogramNodePlacer] arranges subtrees as dendrograms.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DendrogramNodePlacer">Online Documentation</a>
 * 
 * @constructor Creates a new [DendrogramNodePlacer] instance with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DendrogramNodePlacer%23DendrogramNodePlacer-constructor-DendrogramNodePlacer">Online Documentation</a>
 */
external open class DendrogramNodePlacer  () : IFromSketchNodePlacer {

/**
 * Gets or sets the minimum distance between the [SubtreeShape] of a root node and the bus connecting to all of its children.
 * 
 * Default value - `30`
 * @throws ArgumentError if the specified distance is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DendrogramNodePlacer%23minimumRootDistance">Online Documentation</a>
 */
open var minimumRootDistance: Double
/**
 * Gets or sets the minimum horizontal distance between adjacent [SubtreeShapes][SubtreeShape].
 * 
 * Default value - `30`
 * @throws ArgumentError if the specified distance is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DendrogramNodePlacer%23minimumSubtreeDistance">Online Documentation</a>
 */
open var minimumSubtreeDistance: Double
/**
 * Creates a [IComparer] that sorts outgoing edges according to the x-coordinate of their target nodes.
 * @return the [IComparer]
 * @see [createFromSketchComparer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DendrogramNodePlacer%23DendrogramNodePlacer-method-createComparer">Online Documentation</a>
 */
 open   fun createComparer():IComparer<Edge>
/**
 * Creates a [IComparer] for the edges which takes the initial x-coordinates of the nodes into account.
 * @return the [IComparer] for the edges
 * @see [createComparer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DendrogramNodePlacer%23DendrogramNodePlacer-method-createFromSketchComparer">Online Documentation</a>
 */
 override   fun createFromSketchComparer():IComparer<Node>
/**
 * Creates an optional [IProcessor] for pre- and post-processing.
 * @param [layouter] the current [TreeLayout] instance
 * @param [graph] the input graph
 * @param [currentRoot] the root node handled by this [INodePlacer]
 * @return `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DendrogramNodePlacer%23DendrogramNodePlacer-method-createProcessor">Online Documentation</a>
 */
 override   fun createProcessor( layouter: TreeLayout ,
 graph: LayoutGraph ,
 currentRoot: Node ):IProcessor?
/**
 * Provides [ParentConnectorDirection.NORTH] for all children.
 * @param [localRoot] the local root node
 * @param [connectorMap] the map that is used for storing the direction specifiers of the child nodes
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DendrogramNodePlacer%23DendrogramNodePlacer-method-determineChildConnectors">Online Documentation</a>
 */
 override   fun determineChildConnectors( localRoot: Node ,
 connectorMap: IDataMap<Node, ParentConnectorDirection> )
/**
 * Arranges the [SubtreeShapes][SubtreeShape] of the local root and its children as a dendrogram.
 * @param [nodeShapeProvider] the [IDataProvider] for obtaining an initial shape of the root node
 * @param [subtreeShapeProvider] the [IDataProvider] for accessing the pre-calculated shapes of the subtrees
 * @param [graph] the input graph
 * @param [localRoot] the root of the subtree that should be arranged by this method
 * @param [parentConnectorDirection] the direction specifier for the connector of the local root node to its parent node
 * @return the combined shape of the whole subtree rooted at the given local root node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DendrogramNodePlacer%23DendrogramNodePlacer-method-placeSubtree">Online Documentation</a>
 */
 override   fun placeSubtree( nodeShapeProvider: IDataProvider<Node, SubtreeShape> ,
 subtreeShapeProvider: IDataProvider<Node, SubtreeShape> ,
 graph: LayoutGraph ,
 localRoot: Node ,
 parentConnectorDirection: ParentConnectorDirection ):SubtreeShape

companion object : ClassMetadata<DendrogramNodePlacer> {
}
}

inline fun DendrogramNodePlacer(
    block: DendrogramNodePlacer.() -> Unit
): DendrogramNodePlacer {
    return DendrogramNodePlacer()
        .apply(block)
}
