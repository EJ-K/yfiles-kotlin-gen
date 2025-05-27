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
import yfiles.algorithms.YDimension
import yfiles.algorithms.YList
import yfiles.lang.ClassMetadata
import yfiles.lang.Id

/**
 * This class is a default implementation of interface [IElementFactory].
 * @see [IElementFactory]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultElementFactory">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [DefaultElementFactory].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultElementFactory%23DefaultElementFactory-constructor-DefaultElementFactory">Online Documentation</a>
 */
external open class DefaultElementFactory  () : IElementFactory {

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultElementFactory%23DefaultElementFactory-method-createConnectorEdge">Online Documentation</a>
 */
 override   fun createConnectorEdge( context: LayoutContext ,
 connector: Node ,
 opposite: Node ,
 origEdgeId: Id ,
 atTarget: Boolean ):Edge
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultElementFactory%23DefaultElementFactory-method-createConnectorNode">Online Documentation</a>
 */
 override   fun createConnectorNode( context: LayoutContext ,
 edgeIds: YList<Id> ,
 representedNodeId: Id ):Node
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultElementFactory%23DefaultElementFactory-method-createProxyEdge">Online Documentation</a>
 */
 override   fun createProxyEdge( context: LayoutContext ,
 proxyNode: Node ,
 opposite: Node ,
 replacingEdgeId: Id ,
 origNodeId: Id ):Edge
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultElementFactory%23DefaultElementFactory-method-createProxyNode">Online Documentation</a>
 */
 override   fun createProxyNode( context: LayoutContext ,
 origNodeId: Id ):Node
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultElementFactory%23DefaultElementFactory-method-createProxyReferenceEdge">Online Documentation</a>
 */
 override   fun createProxyReferenceEdge( context: LayoutContext ,
 proxyReference: Node ,
 opposite: Node ,
 referencingCopyId: Id ):Edge
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultElementFactory%23DefaultElementFactory-method-createProxyReferenceNode">Online Documentation</a>
 */
 override   fun createProxyReferenceNode( context: LayoutContext ,
 referringProxyId: Id ):Node
/**
 * Returns the default size for nodes created by this factory.
 * @param [context] an object providing relevant layout information, for example, the current graph as well as various information about the graph elements
 * @param [id] the element ID
 * @param [type] the type of the node to be created
 * @return the default size of the new node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultElementFactory%23DefaultElementFactory-method-getDefaultNodeSize">Online Documentation</a>
 */
 open protected   fun getDefaultNodeSize( context: LayoutContext ,
 id: Id ,
 type: Int ):YDimension

companion object : ClassMetadata<DefaultElementFactory> {
}
}
