// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

import yfiles.algorithms.IDataMap
import yfiles.algorithms.IDataProvider
import yfiles.algorithms.Node
import yfiles.lang.ClassMetadata
import yfiles.layout.LayoutGraph

/**
 * This [INodePlacer] places the children of a local root in groups.
 * @see [PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY][yfiles.layout.PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY]
 * @see [PortConstraintKeys.TARGET_GROUP_ID_DP_KEY][yfiles.layout.PortConstraintKeys.TARGET_GROUP_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupedNodePlacer">Online Documentation</a>
 * 
 * @constructor Creates a new [GroupedNodePlacer] instance.
 * @param [groupPlacer] the [INodePlacer] which places the child groups
 * @param [childPlacer] the [INodePlacer] which places the children within their group
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupedNodePlacer%23GroupedNodePlacer-constructor-GroupedNodePlacer">Online Documentation</a>
 */
external open class GroupedNodePlacer  ( groupPlacer: INodePlacer ,
 childPlacer: INodePlacer? ) : INodePlacer {

/**
 * Creates a [IProcessor] that prepares the graph for edge grouping.
 * @param [layouter] the current [TreeLayout] instance
 * @param [graph] the input graph
 * @param [currentRoot] the root node handled by this [INodePlacer]
 * @return the [IProcessor] responsible for preparing the graph
 * @see [PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY][yfiles.layout.PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY]
 * @see [PortConstraintKeys.TARGET_GROUP_ID_DP_KEY][yfiles.layout.PortConstraintKeys.TARGET_GROUP_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupedNodePlacer%23GroupedNodePlacer-method-createProcessor">Online Documentation</a>
 */
 override   fun createProcessor( layouter: TreeLayout ,
 graph: LayoutGraph ,
 currentRoot: Node ):IProcessor?
/**
 * Delegates to the [INodePlacer] responsible for arranging the nodes in one group.
 * @param [localRoot] the local root node
 * @param [connectorMap] the map used for storing the direction specifiers of the child nodes
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupedNodePlacer%23GroupedNodePlacer-method-determineChildConnectors">Online Documentation</a>
 */
 override   fun determineChildConnectors( localRoot: Node ,
 connectorMap: IDataMap<Node, ParentConnectorDirection> )
/**
 * Places the groups of [SubtreeShape]s according to their group IDs.
 * @param [nodeShapeProvider] the [IDataProvider] for obtaining an initial shape of the root node
 * @param [subtreeShapeProvider] the [IDataProvider] for accessing the pre-calculated shapes of the subtrees
 * @param [graph] the input graph
 * @param [localRoot] the root of the subtree that should be arranged by this method
 * @param [parentConnectorDirection] the direction specifier for the connector of the local root node to its parent node
 * @return the merged [SubtreeShape]s of the local root and its children
 * @see [PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY][yfiles.layout.PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY]
 * @see [PortConstraintKeys.TARGET_GROUP_ID_DP_KEY][yfiles.layout.PortConstraintKeys.TARGET_GROUP_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupedNodePlacer%23GroupedNodePlacer-method-placeSubtree">Online Documentation</a>
 */
 override   fun placeSubtree( nodeShapeProvider: IDataProvider<Node, SubtreeShape> ,
 subtreeShapeProvider: IDataProvider<Node, SubtreeShape> ,
 graph: LayoutGraph ,
 localRoot: Node ,
 parentConnectorDirection: ParentConnectorDirection ):SubtreeShape

companion object : ClassMetadata<GroupedNodePlacer> {
}
}
