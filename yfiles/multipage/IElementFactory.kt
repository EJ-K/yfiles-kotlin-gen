// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.multipage

import yfiles.algorithms.Edge
import yfiles.algorithms.Node
import yfiles.algorithms.YList
import yfiles.lang.Id
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * Factory used by class [MultiPageLayout] to create special nodes and edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IElementFactory">Online Documentation</a>
 */
external interface IElementFactory : YObject {
/**
 * Callback method for creating an edge of type [EdgeType.CONNECTOR].
 * @param [context] an object providing relevant layout information, for example, the current graph as well as various information about the graph elements
 * @param [connector] the endpoint of the edge that represents the connector node
 * @param [opposite] the other endpoint of the edge
 * @param [origEdgeId] the ID of the edge that is split by the connector edge
 * @param [atTarget] `true` if the connector node is the target of the edge, `false` otherwise
 * @return the created connector edge
 * @see [EdgeType.CONNECTOR]
 * @see [NodeType.CONNECTOR]
 * @see [LayoutContext.createEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IElementFactory%23IElementFactory-method-createConnectorEdge">Online Documentation</a>
 */
   fun createConnectorEdge( context: LayoutContext ,
 connector: Node ,
 opposite: Node ,
 origEdgeId: Id ,
 atTarget: Boolean ):Edge
/**
 * Callback method for creating a node of type [NodeType.CONNECTOR].
 * @param [context] an object providing relevant layout information, for example, the current graph as well as various information about the graph elements
 * @param [edgeIds] a [list][YList] that contains the IDs of edges that are split by this connector
 * @param [representedNodeId] the ID of the node that is represented by this connector
 * @return the created connector node
 * @see [NodeType.CONNECTOR]
 * @see [LayoutContext.createNode]
 * @see [INodeInfo.representedNode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IElementFactory%23IElementFactory-method-createConnectorNode">Online Documentation</a>
 */
   fun createConnectorNode( context: LayoutContext ,
 edgeIds: YList<Id> ,
 representedNodeId: Id ):Node
/**
 * Callback method for creating an edge of type [EdgeType.PROXY].
 * @param [context] an object providing relevant layout information, for example, the current graph as well as various information about the graph elements
 * @param [proxyNode] the endpoint of the edge that represents the proxy node
 * @param [opposite] the other endpoint of the new edge
 * @param [replacingEdgeId] the ID of the related edge that is connected to the original node
 * @param [origNodeId] the ID of the original node to which the proxy node refers
 * @return the created proxy edge
 * @see [EdgeType.PROXY]
 * @see [NodeType.PROXY]
 * @see [LayoutContext.createEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IElementFactory%23IElementFactory-method-createProxyEdge">Online Documentation</a>
 */
   fun createProxyEdge( context: LayoutContext ,
 proxyNode: Node ,
 opposite: Node ,
 replacingEdgeId: Id ,
 origNodeId: Id ):Edge
/**
 * Callback method for creating a node of type [NodeType.PROXY].
 * @param [context] an object providing relevant layout information, for example, the current graph as well as various information about the graph elements
 * @param [origNodeId] the ID of the node for which a proxy has to be created
 * @return the created proxy node
 * @see [LayoutContext.createNode]
 * @see [NodeType.PROXY_REFERENCE]
 * @see [NodeType.PROXY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IElementFactory%23IElementFactory-method-createProxyNode">Online Documentation</a>
 */
   fun createProxyNode( context: LayoutContext ,
 origNodeId: Id ):Node
/**
 * Callback method for creating an edge of type [EdgeType.PROXY_REFERENCE].
 * @param [context] an object providing relevant layout information, for example, the current graph as well as various information about the graph elements
 * @param [proxyReference] the endpoint of the edge that represents the proxy reference node
 * @param [opposite] the other endpoint of the new edge
 * @param [referencingCopyId] the ID of the proxy node that is referenced by the proxy reference node
 * @return the created proxy reference edge
 * @see [EdgeType.PROXY_REFERENCE]
 * @see [NodeType.PROXY_REFERENCE]
 * @see [LayoutContext.createEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IElementFactory%23IElementFactory-method-createProxyReferenceEdge">Online Documentation</a>
 */
   fun createProxyReferenceEdge( context: LayoutContext ,
 proxyReference: Node ,
 opposite: Node ,
 referencingCopyId: Id ):Edge
/**
 * Callback method for creating a node of type [NodeType.PROXY_REFERENCE].
 * @param [context] an object providing relevant layout information, for example, the current graph as well as various information about the graph elements
 * @param [referringProxyId] the ID of the proxy to which the created node refers
 * @return the new proxy reference node
 * @see [NodeType.PROXY_REFERENCE]
 * @see [LayoutContext.createNode]
 * @see [NodeType.PROXY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IElementFactory%23IElementFactory-method-createProxyReferenceNode">Online Documentation</a>
 */
   fun createProxyReferenceNode( context: LayoutContext ,
 referringProxyId: Id ):Node

companion object : InterfaceMetadata<IElementFactory> {
}
}
