// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.IListEnumerable
import yfiles.collections.ItemEventArgs
import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.geometry.Size
import yfiles.lang.ClassMetadata
import yfiles.lang.EventArgs
import yfiles.lang.EventHandler1
import yfiles.lang.YClass
import yfiles.lang.YObject
import yfiles.styles.IEdgeStyle
import yfiles.styles.ILabelStyle
import yfiles.styles.INodeStyle
import yfiles.styles.IPortStyle

/**
 * Central implementation of the [IGraph] interface.
 * @see [createUndoEngine]
 * @see [lookup]
 * @see [DefaultGraph]
 * @see [FoldingManager]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph">Online Documentation</a>
 * 
 * @constructor Creates a new instance of a graph that provides an [ILookupDecorator] for all of its entities.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-constructor-DefaultGraph">Online Documentation</a>
 */
external open class DefaultGraph  () : IGraph {

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23edgeDefaults">Online Documentation</a>
 */
final override var edgeDefaults: IEdgeDefaults
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23edges">Online Documentation</a>
 */
final override val edges: IListEnumerable<IEdge>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23groupNodeDefaults">Online Documentation</a>
 */
final override var groupNodeDefaults: INodeDefaults
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23labels">Online Documentation</a>
 */
final override val labels: IListEnumerable<ILabel>
/**
 * Gets the mapper registry that is associated with this graph instance.
 * @see [IMapperRegistry]
 * @see [IModelItem]
 * @see [ITagOwner.tag]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23mapperRegistry">Online Documentation</a>
 */
final override var mapperRegistry: IMapperRegistry
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23nodeDefaults">Online Documentation</a>
 */
final override var nodeDefaults: INodeDefaults
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23nodes">Online Documentation</a>
 */
final override val nodes: IListEnumerable<INode>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23ports">Online Documentation</a>
 */
final override val ports: IListEnumerable<IPort>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23tag">Online Documentation</a>
 */
final override var tag: Tag?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-addBend">Online Documentation</a>
 */
 override   fun addBend( edge: IEdge ,
 location: Point ,
 index: Int ):IBend
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-addLabel">Online Documentation</a>
 */
 override   fun addLabel( owner: ILabelOwner ,
 text: String ,
 layoutParameter: ILabelModelParameter? ,
 style: ILabelStyle? ,
 preferredSize: Size? ,
 tag: Tag? ):ILabel
/**
 * Adds the chain element to the lookup for this instance.
 * @param [lookup] The lookup to decorate the current instance with.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-addLookup">Online Documentation</a>
 */
 open   fun addLookup( lookup: IContextLookupChainLink<DefaultGraph> )
/**
 * Add a port to the given port owner using the coordinates as the new initial position of the port anchor.
 * @param [owner] the owner to add the port instance to.
 * @param [locationParameter] the parameter to use for the port to determine its location.
 * @param [style] the style to assign initially to the port, e.g. [VoidPortStyle.INSTANCE][yfiles.styles.VoidPortStyle.INSTANCE].
 * @param [tag] The tag to associate with the port, may be `null`.
 * @return the newly created port
 * @throws NotSupportedError If this instance cannot add a port to `owner`.
 * @throws ArgumentError If `owner` is not in this graph.
 * @see [addPortAddedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-addPort">Online Documentation</a>
 */
 override   fun addPort( owner: IPortOwner ,
 locationParameter: IPortLocationModelParameter? ,
 style: IPortStyle? ,
 tag: Tag? ):IPort
/**
 * Determines whether this graph contains the specified item.
 * @param [item] The item.
 * @return `true` if this graph contains the specified item; otherwise, `false`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-contains">Online Documentation</a>
 */
 override  operator fun contains( item: IModelItem ):Boolean
/**
 * Creates and returns an edge that connects to the given node instances using the given style instance.
 * @param [source] The source node the created edge will connect to. This implementation queries the [getNewSourcePort] method to determine which port to use.
 * @param [target] The target node the created edge will connect to. This implementation queries the [getNewSourcePort] method to determine which port to use.
 * @param [style] The style instance that will be assigned to the newly created instance. This is done by reference.
 * @param [tag] the initial [ITagOwner.tag] to assign.
 * @return the newly created edge instance
 * @throws ArgumentError If `source` or `target` is not in this graph.
 * @see [addEdgeCreatedListener]
 * @see [getNewSourcePort]
 * @see [getNewTargetPort]
 * @see [createEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-createEdge">Online Documentation</a>
 */
 override   fun createEdge( source: INode ,
 target: INode ,
 style: IEdgeStyle? ,
 tag: Tag? ):IEdge
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-createEdge">Online Documentation</a>
 */
 override   fun createEdge( sourcePort: IPort ,
 targetPort: IPort ,
 style: IEdgeStyle? ,
 tag: Tag? ):IEdge
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-createGroupNode">Online Documentation</a>
 */
 final override   fun createGroupNode( parent: INode? ,
 layout: Rect? ,
 style: INodeStyle? ,
 tag: Tag? ):INode
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-createNode">Online Documentation</a>
 */
 override   fun createNode( layout: Rect ,
 style: INodeStyle? ,
 tag: Tag? ):INode
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-createNode">Online Documentation</a>
 */
 override   fun createNode( parent: INode? ,
 layout: Rect? ,
 style: INodeStyle? ,
 tag: Tag? ):INode
/**
 * Creates an [UndoEngine] instance that automatically triggers [invalidateDisplays] upon each invocation of [UndoEngine.undo] and [UndoEngine.redo]
 * @return An [UndoEngine] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-createUndoEngine">Online Documentation</a>
 */
 open protected   fun createUndoEngine():UndoEngine
/**
 * Creates the bend addition [undo unit][IUndoUnit] for the given bend.
 * @param [bend] The bend that has been added.
 * @param [index] The index at which the bend has been added.
 * @return The unit that can be used to undo and redo the creation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-createUndoUnitForBendAddition">Online Documentation</a>
 */
 open protected   fun createUndoUnitForBendAddition( bend: IBend ,
 index: Int ):IUndoUnit
/**
 * Creates the bend removal [undo unit][IUndoUnit] for the given bend.
 * @param [bend] The bend that will be removed.
 * @return The unit that can be used to undo and redo the removal.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-createUndoUnitForBendRemoval">Online Documentation</a>
 */
 open protected   fun createUndoUnitForBendRemoval( bend: IBend ):IUndoUnit
/**
 * Creates the [undo unit][IUndoUnit] for changing the tag of the given bend.
 * @param [bend] The bend whose tag has been changed.
 * @param [oldTag] The old tag used before the change.
 * @return The unit that can be used to undo and redo the tag change.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-createUndoUnitForBendTagChange">Online Documentation</a>
 */
 open protected   fun createUndoUnitForBendTagChange( bend: IBend ,
 oldTag: Tag? ):IUndoUnit
/**
 * Creates the edge creation [undo unit][IUndoUnit] for the given edge.
 * @param [edge] The edge that has been created.
 * @return The unit that can be used to undo and redo the creation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-createUndoUnitForEdgeCreation">Online Documentation</a>
 */
 open protected   fun createUndoUnitForEdgeCreation( edge: IEdge ):IUndoUnit
/**
 * Creates the edge reconnection [undo unit][IUndoUnit] for the given edge.
 * @param [edge] The edge that has been reconnected to other ports.
 * @param [oldSource] The old source port the edge connected to before the change.
 * @param [oldTarget] The old target port the edge connected to before the change.
 * @return The unit that can be used to undo and redo the port change operation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-createUndoUnitForEdgeReconnection">Online Documentation</a>
 */
 open protected   fun createUndoUnitForEdgeReconnection( edge: IEdge ,
 oldSource: IPort ,
 oldTarget: IPort ):IUndoUnit
/**
 * Creates the edge removal [undo unit][IUndoUnit] for the given edge.
 * @param [edge] The edge that will be removed.
 * @return The unit that can be used to undo and redo the removal.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-createUndoUnitForEdgeRemoval">Online Documentation</a>
 */
 open protected   fun createUndoUnitForEdgeRemoval( edge: IEdge ):IUndoUnit
/**
 * Creates the [undo unit][IUndoUnit] for changing the style of the given edge.
 * @param [edge] The edge whose style has been changed.
 * @param [oldStyle] The old style used before the change.
 * @return The unit that can be used to undo and redo the style change.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-createUndoUnitForEdgeStyleChange">Online Documentation</a>
 */
 open protected   fun createUndoUnitForEdgeStyleChange( edge: IEdge ,
 oldStyle: IEdgeStyle ):IUndoUnit
/**
 * Creates the [undo unit][IUndoUnit] for changing the tag of the given edge.
 * @param [edge] The edge whose tag has been changed.
 * @param [oldTag] The old tag used before the change.
 * @return The unit that can be used to undo and redo the tag change.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-createUndoUnitForEdgeTagChange">Online Documentation</a>
 */
 open protected   fun createUndoUnitForEdgeTagChange( edge: IEdge ,
 oldTag: Tag? ):IUndoUnit
/**
 * Creates the [undo unit][IUndoUnit] for changing the tag of the given graph.
 * @param [tagOwner] The graph whose tag has been changed.
 * @param [oldTag] The old tag used before the change.
 * @return The unit that can be used to undo and redo the tag change.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-createUndoUnitForGraphTagChange">Online Documentation</a>
 */
 open protected   fun createUndoUnitForGraphTagChange( tagOwner: ITagOwner ,
 oldTag: Tag? ):IUndoUnit
/**
 * Creates the [undo unit][IUndoUnit] for changing whether the given node is a group node.
 * @param [node] The node whose group node status has been changed.
 * @param [isGroupNode] The new group node status.
 * @return The unit that can be used to undo and redo the group node status change.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-createUndoUnitForIsGroupNodeChange">Online Documentation</a>
 */
 open protected   fun createUndoUnitForIsGroupNodeChange( node: INode ,
 isGroupNode: Boolean ):IUndoUnit
/**
 * Creates the label addition [undo unit][IUndoUnit] for the given label.
 * @param [label] The label that has been added.
 * @return The unit that can be used to undo and redo the creation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-createUndoUnitForLabelAddition">Online Documentation</a>
 */
 open protected   fun createUndoUnitForLabelAddition( label: ILabel ):IUndoUnit
/**
 * Creates the [undo unit][IUndoUnit] for changing the layout parameter of the given label.
 * @param [label] The label whose layout parameter has been changed.
 * @param [oldParam] The old layout parameter used before the change.
 * @return The unit that can be used to undo and redo the layout parameter change.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-createUndoUnitForLabelModelParameterChange">Online Documentation</a>
 */
 open protected   fun createUndoUnitForLabelModelParameterChange( label: ILabel ,
 oldParam: ILabelModelParameter ):IUndoUnit
/**
 * Creates the label removal [undo unit][IUndoUnit] for the given label.
 * @param [label] The label that will be removed.
 * @return The unit that can be used to undo and redo the removal.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-createUndoUnitForLabelRemoval">Online Documentation</a>
 */
 open protected   fun createUndoUnitForLabelRemoval( label: ILabel ):IUndoUnit
/**
 * Creates the [undo unit][IUndoUnit] for changing the style of the given label.
 * @param [label] The label whose style has been changed.
 * @param [oldStyle] The old style used before the change.
 * @return The unit that can be used to undo and redo the style change.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-createUndoUnitForLabelStyleChange">Online Documentation</a>
 */
 open protected   fun createUndoUnitForLabelStyleChange( label: ILabel ,
 oldStyle: ILabelStyle ):IUndoUnit
/**
 * Creates the [undo unit][IUndoUnit] for changing the tag of the given label.
 * @param [label] The label whose tag has been changed.
 * @param [oldTag] The old tag used before the change.
 * @return The unit that can be used to undo and redo the tag change.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-createUndoUnitForLabelTagChange">Online Documentation</a>
 */
 open protected   fun createUndoUnitForLabelTagChange( label: ILabel ,
 oldTag: Tag? ):IUndoUnit
/**
 * Creates the [undo unit][IUndoUnit] for changing the text of the given label.
 * @param [label] The label whose text has been changed.
 * @param [oldText] The old text used before the change.
 * @return The unit that can be used to undo and redo the text change.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-createUndoUnitForLabelTextChange">Online Documentation</a>
 */
 open protected   fun createUndoUnitForLabelTextChange( label: ILabel ,
 oldText: String ):IUndoUnit
/**
 * Creates the [undo unit][IUndoUnit] for changing the location parameter of the given port.
 * @param [port] The port whose location parameter has been changed.
 * @param [oldParameter] The old location parameter used before the change.
 * @return The unit that can be used to undo and redo the location parameter change.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-createUndoUnitForLocationParameterChange">Online Documentation</a>
 */
 open protected   fun createUndoUnitForLocationParameterChange( port: IPort ,
 oldParameter: IPortLocationModelParameter ):IUndoUnit
/**
 * Creates the node creation [undo unit][IUndoUnit] for the given node.
 * @param [node] The node that has been created.
 * @return The unit that can be used to undo and redo the creation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-createUndoUnitForNodeCreation">Online Documentation</a>
 */
 open protected   fun createUndoUnitForNodeCreation( node: INode ,
 parent: INode? ,
 isGroupNode: Boolean ):IUndoUnit
/**
 * Creates the node removal [undo unit][IUndoUnit] for the given node.
 * @param [node] The node that will be removed.
 * @return The unit that can be used to undo and redo the removal.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-createUndoUnitForNodeRemoval">Online Documentation</a>
 */
 open protected   fun createUndoUnitForNodeRemoval( node: INode ):IUndoUnit
/**
 * Creates the [undo unit][IUndoUnit] for changing the style of the given node.
 * @param [node] The node whose style has been changed.
 * @param [oldStyle] The old style used before the change.
 * @return The unit that can be used to undo and redo the style change.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-createUndoUnitForNodeStyleChange">Online Documentation</a>
 */
 open protected   fun createUndoUnitForNodeStyleChange( node: INode ,
 oldStyle: INodeStyle ):IUndoUnit
/**
 * Creates the [undo unit][IUndoUnit] for changing the tag of the given node.
 * @param [node] The node whose tag has been changed.
 * @param [oldTag] The old tag used before the change.
 * @return The unit that can be used to undo and redo the tag change.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-createUndoUnitForNodeTagChange">Online Documentation</a>
 */
 open protected   fun createUndoUnitForNodeTagChange( node: INode ,
 oldTag: Tag? ):IUndoUnit
/**
 * Creates the parent change [undo unit][IUndoUnit] for the given node.
 * @param [node] The node whose parent has been changed.
 * @param [newParent] The node which is the new parent.
 * @return The unit that can be used to undo and redo the parent change.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-createUndoUnitForParentChange">Online Documentation</a>
 */
 open protected   fun createUndoUnitForParentChange( node: INode ,
 oldParent: INode? ,
 newParent: INode? ):IUndoUnit
/**
 * Creates the port addition [undo unit][IUndoUnit] for the given port.
 * @param [port] The port that has been added.
 * @return The unit that can be used to undo and redo the creation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-createUndoUnitForPortAddition">Online Documentation</a>
 */
 open protected   fun createUndoUnitForPortAddition( port: IPort ):IUndoUnit
/**
 * Creates the port removal [undo unit][IUndoUnit] for the given port.
 * @param [port] The port that will be removed.
 * @return The unit that can be used to undo and redo the removal.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-createUndoUnitForPortRemoval">Online Documentation</a>
 */
 open protected   fun createUndoUnitForPortRemoval( port: IPort ):IUndoUnit
/**
 * Creates the [undo unit][IUndoUnit] for changing the style of the given port.
 * @param [port] The port whose style has been changed.
 * @param [oldStyle] The old style used before the change.
 * @return The unit that can be used to undo and redo the style change.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-createUndoUnitForPortStyleChange">Online Documentation</a>
 */
 open protected   fun createUndoUnitForPortStyleChange( port: IPort ,
 oldStyle: IPortStyle ):IUndoUnit
/**
 * Creates the [undo unit][IUndoUnit] for changing the tag of the given port.
 * @param [port] The port whose tag has been changed.
 * @param [oldTag] The old tag used before the change.
 * @return The unit that can be used to undo and redo the tag change.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-createUndoUnitForPortTagChange">Online Documentation</a>
 */
 open protected   fun createUndoUnitForPortTagChange( port: IPort ,
 oldTag: Tag? ):IUndoUnit
/**
 * Creates the [undo unit][IUndoUnit] for changing the preferred size of the given label.
 * @param [label] The label whose preferred size has been changed.
 * @param [oldSize] The old preferred size used before the change.
 * @return The unit that can be used to undo and redo the preferred size change.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-createUndoUnitForPreferredSizeChange">Online Documentation</a>
 */
 open protected   fun createUndoUnitForPreferredSizeChange( label: ILabel ,
 oldSize: Size ):IUndoUnit
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-edgesAt">Online Documentation</a>
 */
 override   fun edgesAt( port: IPort ,
 type: AdjacencyTypes ):IListEnumerable<IEdge>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-edgesAt">Online Documentation</a>
 */
 override   fun edgesAt( owner: IPortOwner ,
 type: AdjacencyTypes ):IListEnumerable<IEdge>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-getChildren">Online Documentation</a>
 */
 final override   fun getChildren( node: INode? ):IListEnumerable<INode>
/**
 * Returns the lookup implementation that is used for [lookup] calls.
 * @return The replacing lookup instance or `null` if the internal lookup mechanism is used.
 * @see [setLookupImplementation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-getLookup">Online Documentation</a>
 */
 open   fun getLookup():ILookup?
/**
 * Determines a [IPort] instance to use for the creation of a new edge that starts at the given [IPortOwner].
 * @param [source] The source node to find a port for.
 * @return The port to use for a newly created edge.
 * @see [createEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-getNewSourcePort">Online Documentation</a>
 */
 open protected   fun getNewSourcePort( source: IPortOwner ):IPort
/**
 * Determines a [IPort] instance to use for the creation of a new edge that ends at the given [IPortOwner].
 * @param [targetOwner] The target node to find a port for.
 * @return The port to use for a newly created edge.
 * @see [createEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-getNewTargetPort">Online Documentation</a>
 */
 open protected   fun getNewTargetPort( targetOwner: IPortOwner ):IPort
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-getParent">Online Documentation</a>
 */
 final override   fun getParent( node: INode ):INode?
/**
 * The last element in the lookup chain is implemented by this method.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-innerLookup">Online Documentation</a>
 */
 open protected   fun <T : YObject>innerLookup( type: YClass<T> ):T?
/**
 * Triggers the [DisplaysInvalidated] event.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-invalidateDisplays">Online Documentation</a>
 */
 override   fun invalidateDisplays()
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-isGroupNode">Online Documentation</a>
 */
 final override   fun isGroupNode( node: INode ):Boolean
/**
 * Returns an instance that provides another aspect of this instance of the given type or `null`.
 * @param [type] the type for which an instance shall be returned
 * @return An instance that is assignable to type or `null`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-lookup">Online Documentation</a>
 */
 override   fun <T : YObject>lookup( type: YClass<T> ):T?
/**
 * Called before a bend is added to this graph's structure.
 * @param [edge] The edge the bend will be added to.
 * @param [bend] The bend that will be added to the edge.
 * @param [index] The index where the bend will be added to the edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onAddingBend">Online Documentation</a>
 */
 open protected   fun onAddingBend( edge: IEdge ,
 bend: IBend ,
 index: Int )
/**
 * Called just before an edge label is added to an edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onAddingEdgeLabel">Online Documentation</a>
 */
 open protected   fun onAddingEdgeLabel( edge: IEdge ,
 label: ILabel )
/**
 * Called just before a node label is added to a node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onAddingNodeLabel">Online Documentation</a>
 */
 open protected   fun onAddingNodeLabel( node: INode ,
 label: ILabel )
/**
 * Called when a port is going to be added to a node.
 * @param [owner] The node.
 * @param [port] The port to be added.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onAddingPort">Online Documentation</a>
 */
 open protected   fun onAddingPort( owner: IPortOwner ,
 port: IPort )
/**
 * Called just before a port label is added to a port.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onAddingPortLabel">Online Documentation</a>
 */
 open protected   fun onAddingPortLabel( port: IPort ,
 label: ILabel )
/**
 * Called after a bend has been added to this graph's structure.
 * @param [bend] The bend that has been added to the edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onBendAdded">Online Documentation</a>
 */
 open protected   fun onBendAdded( bend: IBend )
/**
 * Called after a bend location has changed.
 * @param [bend] The bend whose location has changed.
 * @param [oldLocation] The bend location before the change
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onBendLocationChanged">Online Documentation</a>
 */
 open protected   fun onBendLocationChanged( bend: IBend ,
 oldLocation: Point )
/**
 * Called just after a bend has been removed from its edge.
 * @param [owner] The old edge.
 * @param [bend] The bend.
 * @param [index] The former index of the bend in the [IEdge.bends] list.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onBendRemoved">Online Documentation</a>
 */
 open protected   fun onBendRemoved( owner: IEdge ,
 bend: IBend ,
 index: Int )
/**
 * Called after a bend tag has changed.
 * @param [bend] The bend whose tag has changed.
 * @param [oldTag] The bend tag before the change
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onBendTagChanged">Online Documentation</a>
 */
 open protected   fun onBendTagChanged( bend: IBend ,
 oldTag: Tag? )
/**
 * Called before the ports of an edge are being changed.
 * @param [edge] An edge whose the ports are to be changed.
 * @param [newSource] The new source port
 * @param [newTarget] The new target port
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onChangingEdgePorts">Online Documentation</a>
 */
 open protected   fun onChangingEdgePorts( edge: IEdge ,
 newSource: IPort ,
 newTarget: IPort )
/**
 * Called before an edge style is being changed.
 * @param [edge] An edge whose the style is going to be changed.
 * @param [newStyle] The new edge style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onChangingEdgeStyle">Online Documentation</a>
 */
 open protected   fun onChangingEdgeStyle( edge: IEdge ,
 newStyle: IEdgeStyle )
/**
 * Called before the graph's tag is being changed.
 * @param [newTag] The new port tag
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onChangingGraphTag">Online Documentation</a>
 */
 open protected   fun onChangingGraphTag( newTag: Tag? )
/**
 * Called before the [ILabel.layoutParameter] of a label is being changed.
 * @param [label] A label whose [ILabel.layoutParameter] is to be changed.
 * @param [newLayoutParameter] The new label model parameter
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onChangingLabelLayoutParameter">Online Documentation</a>
 */
 open protected   fun onChangingLabelLayoutParameter( label: ILabel ,
 newLayoutParameter: ILabelModelParameter )
/**
 * Called before the preferred size of a label is being changed.
 * @param [label] A label whose preferred size is going to be changed.
 * @param [newSize] The new preferred size
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onChangingLabelPreferredSize">Online Documentation</a>
 */
 open protected   fun onChangingLabelPreferredSize( label: ILabel ,
 newSize: Size )
/**
 * Called before a label style is being changed.
 * @param [label] A label whose the style is going to be changed.
 * @param [newStyle] The new label style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onChangingLabelStyle">Online Documentation</a>
 */
 open protected   fun onChangingLabelStyle( label: ILabel ,
 newStyle: ILabelStyle )
/**
 * Called before the text of a label is being changed.
 * @param [label] A label whose text is going to be changed.
 * @param [newText] The new label text
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onChangingLabelText">Online Documentation</a>
 */
 open protected   fun onChangingLabelText( label: ILabel ,
 newText: String )
/**
 * Called before a node style is being changed.
 * @param [node] A node whose the style is going to be changed.
 * @param [newStyle] The new node style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onChangingNodeStyle">Online Documentation</a>
 */
 open protected   fun onChangingNodeStyle( node: INode ,
 newStyle: INodeStyle )
/**
 * Called before the [IPort.locationParameter] of a port is being changed.
 * @param [port] A port whose [IPort.locationParameter] is to be changed.
 * @param [newLocationParameter] The new location model parameter
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onChangingPortLocationModelParameter">Online Documentation</a>
 */
 open protected   fun onChangingPortLocationModelParameter( port: IPort ,
 newLocationParameter: IPortLocationModelParameter )
/**
 * Called before a port style is being changed.
 * @param [port] A port whose the style is going to be changed.
 * @param [newStyle] The new port style.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onChangingPortStyle">Online Documentation</a>
 */
 open protected   fun onChangingPortStyle( port: IPort ,
 newStyle: IPortStyle )
/**
 * Called before the edge is added to this graph's structure.
 * @param [edge] An edge that is not yet contained in this graph.
 * @param [sourcePort] The source port this edge will connect to.
 * @param [targetPort] The target port this edge will connect to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onCreatingEdge">Online Documentation</a>
 */
 open protected   fun onCreatingEdge( edge: IEdge ,
 sourcePort: IPort ,
 targetPort: IPort )
/**
 * Called before the node is added to this graph's structure.
 * @param [node] A node that is not yet contained in this graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onCreatingNode">Online Documentation</a>
 */
 open protected   fun onCreatingNode( node: INode )
/**
 * Triggers the [EdgeCreated] event.
 * @param [edge] The edge that has been created.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onEdgeCreated">Online Documentation</a>
 */
 open protected   fun onEdgeCreated( edge: IEdge )
/**
 * Called after a label has been added to an edge.
 * @param [label] The label that has just been added.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onEdgeLabelAdded">Online Documentation</a>
 */
 open protected   fun onEdgeLabelAdded( label: ILabel )
/**
 * Called after an edge label has been removed from its edge.
 * @param [owner] The previous owner of the label.
 * @param [label] The label that has just been removed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onEdgeLabelRemoved">Online Documentation</a>
 */
 open protected   fun onEdgeLabelRemoved( owner: ILabelOwner ,
 label: ILabel )
/**
 * Called after the ports of an edge has changed.
 * @param [edge] The edge whose ports have changed.
 * @param [oldSource] The source port that the edge had been connected to before the change.
 * @param [oldTarget] The target port that the edge had been connected to before the change.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onEdgePortsChanged">Online Documentation</a>
 */
 open protected   fun onEdgePortsChanged( edge: IEdge ,
 oldSource: IPort ,
 oldTarget: IPort )
/**
 * Triggers the [EdgeRemoved] event.
 * @param [edge] The edge that got removed
 * @param [oldSource] The source port that the edge had been connected to.
 * @param [oldTarget] The target port that the edge had been connected to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onEdgeRemoved">Online Documentation</a>
 */
 open protected   fun onEdgeRemoved( edge: IEdge ,
 oldSource: IPort ,
 oldTarget: IPort )
/**
 * Called after the style of an edge has changed.
 * @param [edge] The edge whose style that has changed.
 * @param [oldStyle] The edge style before the change
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onEdgeStyleChanged">Online Documentation</a>
 */
 open protected   fun onEdgeStyleChanged( edge: IEdge ,
 oldStyle: IEdgeStyle )
/**
 * Called after the tag of an edge has changed.
 * @param [edge] The edge whose tag has changed.
 * @param [oldTag] The edge tag before the change.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onEdgeTagChanged">Online Documentation</a>
 */
 open protected   fun onEdgeTagChanged( edge: IEdge ,
 oldTag: Tag? )
/**
 * Triggers the [GraphTagChanged] event.
 * @param [oldTag] The graph tag before the change.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onGraphTagChanged">Online Documentation</a>
 */
 open protected   fun onGraphTagChanged( oldTag: Tag? )
/**
 * Triggers the [DisplaysInvalidated] event.
 * @param [event] The event arguments.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onInvalidateDisplays">Online Documentation</a>
 */
 open protected   fun onInvalidateDisplays( event: EventArgs )
/**
 * Called after a label model parameter has changed.
 * @param [label] The label whose model parameter has changed.
 * @param [oldLayoutParamater] The label model parameter before the change
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onLabelLayoutParameterChanged">Online Documentation</a>
 */
 open protected   fun onLabelLayoutParameterChanged( label: ILabel ,
 oldLayoutParamater: ILabelModelParameter )
/**
 * Called after the preferred size of a label has changed.
 * @param [label] The label whose preferred size has changed.
 * @param [oldSize] The preferred size of the label before the change
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onLabelPreferredSizeChanged">Online Documentation</a>
 */
 open protected   fun onLabelPreferredSizeChanged( label: ILabel ,
 oldSize: Size )
/**
 * Called after a label style has changed.
 * @param [label] The label whose style has changed.
 * @param [oldStyle] The label style before the change.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onLabelStyleChanged">Online Documentation</a>
 */
 open protected   fun onLabelStyleChanged( label: ILabel ,
 oldStyle: ILabelStyle )
/**
 * Called after a label tag has changed.
 * @param [label] The label whose tag has changed.
 * @param [oldTag] The label tag before the change
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onLabelTagChanged">Online Documentation</a>
 */
 open protected   fun onLabelTagChanged( label: ILabel ,
 oldTag: Tag? )
/**
 * Called after a label text has changed.
 * @param [label] The label whose text has changed.
 * @param [oldText] The label text before the change.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onLabelTextChanged">Online Documentation</a>
 */
 open protected   fun onLabelTextChanged( label: ILabel ,
 oldText: String )
/**
 * Triggers the [NodeCreated] event.
 * @param [node] The node that has been created.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onNodeCreated">Online Documentation</a>
 */
 open protected   fun onNodeCreated( node: INode )
/**
 * Called after a label has been added to a node.
 * @param [label] The label that has just been added.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onNodeLabelAdded">Online Documentation</a>
 */
 open protected   fun onNodeLabelAdded( label: ILabel )
/**
 * Called after a label has been removed from its node.
 * @param [owner] The old owner of the label.
 * @param [label] The label that has just been removed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onNodeLabelRemoved">Online Documentation</a>
 */
 open protected   fun onNodeLabelRemoved( owner: ILabelOwner ,
 label: ILabel )
/**
 * Called after a node layout has changed.
 * @param [node] The node whose layout has changed.
 * @param [oldLayout] The node layout before the change
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onNodeLayoutChanged">Online Documentation</a>
 */
 open protected   fun onNodeLayoutChanged( node: INode ,
 oldLayout: Rect )
/**
 * Triggers the [NodeRemoved] event.
 * @param [node] The node that got removed
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onNodeRemoved">Online Documentation</a>
 */
 open protected   fun onNodeRemoved( node: INode ,
 oldParent: INode? ,
 oldIsGroupNode: Boolean )
/**
 * Called after a node style has changed.
 * @param [node] The node whose style has changed.
 * @param [oldStyle] The node style before the change
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onNodeStyleChanged">Online Documentation</a>
 */
 open protected   fun onNodeStyleChanged( node: INode ,
 oldStyle: INodeStyle )
/**
 * Called after a node tag has changed.
 * @param [node] The node whose tag has changed.
 * @param [oldTag] The node tag before the change
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onNodeTagChanged">Online Documentation</a>
 */
 open protected   fun onNodeTagChanged( node: INode ,
 oldTag: Tag? )
/**
 * Called when a port has been added to a node.
 * @param [port] The port that has just been added to its owner.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onPortAdded">Online Documentation</a>
 */
 open protected   fun onPortAdded( port: IPort )
/**
 * Called after a label has been added to a port.
 * @param [label] The label that has just been added.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onPortLabelAdded">Online Documentation</a>
 */
 open protected   fun onPortLabelAdded( label: ILabel )
/**
 * Called after a port label has been removed from its port.
 * @param [owner] The old owner of the label.
 * @param [label] The label that has just been removed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onPortLabelRemoved">Online Documentation</a>
 */
 open protected   fun onPortLabelRemoved( owner: ILabelOwner ,
 label: ILabel )
/**
 * Called after a port location model parameter has changed.
 * @param [port] The port whose location model parameter has changed.
 * @param [oldLocationParameter] The port location model parameter before the change
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onPortLocationParameterChanged">Online Documentation</a>
 */
 open protected   fun onPortLocationParameterChanged( port: IPort ,
 oldLocationParameter: IPortLocationModelParameter )
/**
 * Called just after a port has been removed from its owner.
 * @param [oldOwner] The previous owner of the port.
 * @param [port] The port that has been removed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onPortRemoved">Online Documentation</a>
 */
 open protected   fun onPortRemoved( oldOwner: IPortOwner ,
 port: IPort )
/**
 * Called after a port style has changed.
 * @param [port] The port whose style has changed.
 * @param [oldStyle] The port style before the change
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onPortStyleChanged">Online Documentation</a>
 */
 open protected   fun onPortStyleChanged( port: IPort ,
 oldStyle: IPortStyle )
/**
 * Called after a port tag has changed.
 * @param [port] The port whose tag has changed.
 * @param [oldTag] The port tag before the change
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onPortTagChanged">Online Documentation</a>
 */
 open protected   fun onPortTagChanged( port: IPort ,
 oldTag: Tag? )
/**
 * Called just before a bend is removed.
 * @param [bend] The bend that will be removed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onRemovingBend">Online Documentation</a>
 */
 open protected   fun onRemovingBend( bend: IBend )
/**
 * Called before the node will be removed.
 * @param [edge] That edge that is going to be removed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onRemovingEdge">Online Documentation</a>
 */
 open protected   fun onRemovingEdge( edge: IEdge )
/**
 * Called just before an edge label is removed from its edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onRemovingEdgeLabel">Online Documentation</a>
 */
 open protected   fun onRemovingEdgeLabel( label: ILabel )
/**
 * Called before the node will be removed.
 * @param [node] That node that is going to be removed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onRemovingNode">Online Documentation</a>
 */
 open protected   fun onRemovingNode( node: INode )
/**
 * Called just before a node label is removed from its node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onRemovingNodeLabel">Online Documentation</a>
 */
 open protected   fun onRemovingNodeLabel( label: ILabel )
/**
 * Called just before a port will be removed.
 * @param [port] The port that is about to be removed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onRemovingPort">Online Documentation</a>
 */
 open protected   fun onRemovingPort( port: IPort )
/**
 * Called just before a port label is removed from its port.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-onRemovingPortLabel">Online Documentation</a>
 */
 open protected   fun onRemovingPortLabel( label: ILabel )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-remove">Online Documentation</a>
 */
 override   fun remove( item: IModelItem )
/**
 * Removes a previously added lookup chain element from the lookup of `this`.
 * @param [lookup] The element to remove.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-removeLookup">Online Documentation</a>
 */
 open   fun removeLookup( lookup: IContextLookupChainLink<DefaultGraph> )
/**
 * Modifies the location of the given bend.
 * @param [bend] the bend whose location is to be modified
 * @param [location] the new coordinates of the bend
 * @throws ArgumentError If `bend` is not in this graph.
 * @see [addBend]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-setBendLocation">Online Documentation</a>
 */
 override   fun setBendLocation( bend: IBend ,
 location: Point )
/**
 * Sets the ports of the given edge to the new values.
 * @param [edge] The edge to change the ports.
 * @param [sourcePort] The new source port instance.
 * @param [targetPort] The new target port instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-setEdgePorts">Online Documentation</a>
 */
 override   fun setEdgePorts( edge: IEdge ,
 sourcePort: IPort ,
 targetPort: IPort )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-setIsGroupNode">Online Documentation</a>
 */
 final override   fun setIsGroupNode( node: INode ,
 isGroupNode: Boolean )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-setLabelLayoutParameter">Online Documentation</a>
 */
 override   fun setLabelLayoutParameter( label: ILabel ,
 layoutParameter: ILabelModelParameter )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-setLabelPreferredSize">Online Documentation</a>
 */
 override   fun setLabelPreferredSize( label: ILabel ,
 preferredSize: Size )
/**
 * Sets the label text of the given label.
 * @param [label] the label to modify
 * @param [text] the new text of the label
 * @throws ArgumentError If `label` is not in this graph.
 * @throws ArgumentError If `text` is `null`.
 * @see [ILabel.text]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-setLabelText">Online Documentation</a>
 */
 override   fun setLabelText( label: ILabel ,
 text: String )
/**
 * Sets the lookup implementation that will be used for [lookup] calls.
 * @param [lookup] The lookup instance to delegate lookup calls to.
 * @see [addLookup]
 * @see [getLookup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-setLookupImplementation">Online Documentation</a>
 */
 open protected   fun setLookupImplementation( lookup: ILookup? )
/**
 * Sets the layout of the given node to the new values.
 * @param [node] a live node that belongs to this graph
 * @param [layout] the new absolute layout in world coordinates of the node
 * @throws ArgumentError `node` is not in this graph, or `layout` contains one or more `NaN` values.
 * @see [INode.layout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-setNodeLayout">Online Documentation</a>
 */
 override   fun setNodeLayout( node: INode ,
 layout: Rect )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-setParent">Online Documentation</a>
 */
 final override   fun setParent( node: INode ,
 parent: INode? )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-setPortLocationParameter">Online Documentation</a>
 */
 override   fun setPortLocationParameter( port: IPort ,
 locationParameter: IPortLocationModelParameter )
/**
 * Assigns the given style instance by reference to the node.
 * @param [node] The node that will be assigned the new style
 * @param [style] The style instance that will be assigned to the node.
 * @throws ArgumentError If `node` is not in this graph.
 * @throws ArgumentError If `style` is `null`.
 * @see [INode.style]
 * @see [onChangingNodeStyle]
 * @see [addNodeStyleChangedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-setStyle">Online Documentation</a>
 */
 override   fun setStyle( node: INode ,
 style: INodeStyle )
/**
 * Assigns the given style instance by reference to the label.
 * @param [label] The label that will be assigned the new style
 * @param [style] The style instance that will be assigned to the label.
 * @throws ArgumentError If `label` is not in this graph.
 * @throws ArgumentError If `style` is `null`.
 * @see [ILabel.style]
 * @see [onChangingLabelStyle]
 * @see [addLabelStyleChangedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-setStyle">Online Documentation</a>
 */
 override   fun setStyle( label: ILabel ,
 style: ILabelStyle )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-setStyle">Online Documentation</a>
 */
 override   fun setStyle( edge: IEdge ,
 style: IEdgeStyle )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DefaultGraph-method-setStyle">Online Documentation</a>
 */
 override   fun setStyle( port: IPort ,
 style: IPortStyle )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23GraphTagChanged">Online Documentation</a>
 */
override fun addGraphTagChangedListener(listener: EventHandler1<ItemChangedEventArgs<IGraph, Tag>>)
override fun removeGraphTagChangedListener(listener: EventHandler1<ItemChangedEventArgs<IGraph, Tag>>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23NodeCreated">Online Documentation</a>
 */
override fun addNodeCreatedListener(listener: EventHandler1<ItemEventArgs<INode>>)
override fun removeNodeCreatedListener(listener: EventHandler1<ItemEventArgs<INode>>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23NodeRemoved">Online Documentation</a>
 */
override fun addNodeRemovedListener(listener: EventHandler1<NodeEventArgs>)
override fun removeNodeRemovedListener(listener: EventHandler1<NodeEventArgs>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23NodeStyleChanged">Online Documentation</a>
 */
override fun addNodeStyleChangedListener(listener: EventHandler1<ItemChangedEventArgs<INode, INodeStyle>>)
override fun removeNodeStyleChangedListener(listener: EventHandler1<ItemChangedEventArgs<INode, INodeStyle>>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23NodeLayoutChanged">Online Documentation</a>
 */
override fun addNodeLayoutChangedListener(listener: NodeLayoutChangedHandler)
override fun removeNodeLayoutChangedListener(listener: NodeLayoutChangedHandler)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23NodeTagChanged">Online Documentation</a>
 */
override fun addNodeTagChangedListener(listener: EventHandler1<ItemChangedEventArgs<INode, Tag>>)
override fun removeNodeTagChangedListener(listener: EventHandler1<ItemChangedEventArgs<INode, Tag>>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23EdgeCreated">Online Documentation</a>
 */
override fun addEdgeCreatedListener(listener: EventHandler1<ItemEventArgs<IEdge>>)
override fun removeEdgeCreatedListener(listener: EventHandler1<ItemEventArgs<IEdge>>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23EdgeRemoved">Online Documentation</a>
 */
override fun addEdgeRemovedListener(listener: EventHandler1<EdgeEventArgs>)
override fun removeEdgeRemovedListener(listener: EventHandler1<EdgeEventArgs>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23EdgeStyleChanged">Online Documentation</a>
 */
override fun addEdgeStyleChangedListener(listener: EventHandler1<ItemChangedEventArgs<IEdge, IEdgeStyle>>)
override fun removeEdgeStyleChangedListener(listener: EventHandler1<ItemChangedEventArgs<IEdge, IEdgeStyle>>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23EdgePortsChanged">Online Documentation</a>
 */
override fun addEdgePortsChangedListener(listener: EventHandler1<EdgeEventArgs>)
override fun removeEdgePortsChangedListener(listener: EventHandler1<EdgeEventArgs>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23EdgeTagChanged">Online Documentation</a>
 */
override fun addEdgeTagChangedListener(listener: EventHandler1<ItemChangedEventArgs<IEdge, Tag>>)
override fun removeEdgeTagChangedListener(listener: EventHandler1<ItemChangedEventArgs<IEdge, Tag>>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23BendAdded">Online Documentation</a>
 */
override fun addBendAddedListener(listener: EventHandler1<ItemEventArgs<IBend>>)
override fun removeBendAddedListener(listener: EventHandler1<ItemEventArgs<IBend>>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23BendRemoved">Online Documentation</a>
 */
override fun addBendRemovedListener(listener: EventHandler1<BendEventArgs>)
override fun removeBendRemovedListener(listener: EventHandler1<BendEventArgs>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23BendLocationChanged">Online Documentation</a>
 */
override fun addBendLocationChangedListener(listener: BendLocationChangedHandler)
override fun removeBendLocationChangedListener(listener: BendLocationChangedHandler)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23BendTagChanged">Online Documentation</a>
 */
override fun addBendTagChangedListener(listener: EventHandler1<ItemChangedEventArgs<IBend, Tag>>)
override fun removeBendTagChangedListener(listener: EventHandler1<ItemChangedEventArgs<IBend, Tag>>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23LabelAdded">Online Documentation</a>
 */
override fun addLabelAddedListener(listener: EventHandler1<ItemEventArgs<ILabel>>)
override fun removeLabelAddedListener(listener: EventHandler1<ItemEventArgs<ILabel>>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23LabelRemoved">Online Documentation</a>
 */
override fun addLabelRemovedListener(listener: EventHandler1<LabelEventArgs>)
override fun removeLabelRemovedListener(listener: EventHandler1<LabelEventArgs>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23LabelStyleChanged">Online Documentation</a>
 */
override fun addLabelStyleChangedListener(listener: EventHandler1<ItemChangedEventArgs<ILabel, ILabelStyle>>)
override fun removeLabelStyleChangedListener(listener: EventHandler1<ItemChangedEventArgs<ILabel, ILabelStyle>>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23LabelPreferredSizeChanged">Online Documentation</a>
 */
override fun addLabelPreferredSizeChangedListener(listener: EventHandler1<ItemChangedEventArgs<ILabel, Size>>)
override fun removeLabelPreferredSizeChangedListener(listener: EventHandler1<ItemChangedEventArgs<ILabel, Size>>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23LabelTextChanged">Online Documentation</a>
 */
override fun addLabelTextChangedListener(listener: EventHandler1<ItemChangedEventArgs<ILabel, String>>)
override fun removeLabelTextChangedListener(listener: EventHandler1<ItemChangedEventArgs<ILabel, String>>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23LabelLayoutParameterChanged">Online Documentation</a>
 */
override fun addLabelLayoutParameterChangedListener(listener: EventHandler1<ItemChangedEventArgs<ILabel, ILabelModelParameter>>)
override fun removeLabelLayoutParameterChangedListener(listener: EventHandler1<ItemChangedEventArgs<ILabel, ILabelModelParameter>>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23LabelTagChanged">Online Documentation</a>
 */
override fun addLabelTagChangedListener(listener: EventHandler1<ItemChangedEventArgs<ILabel, Tag>>)
override fun removeLabelTagChangedListener(listener: EventHandler1<ItemChangedEventArgs<ILabel, Tag>>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23PortAdded">Online Documentation</a>
 */
override fun addPortAddedListener(listener: EventHandler1<ItemEventArgs<IPort>>)
override fun removePortAddedListener(listener: EventHandler1<ItemEventArgs<IPort>>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23PortRemoved">Online Documentation</a>
 */
override fun addPortRemovedListener(listener: EventHandler1<PortEventArgs>)
override fun removePortRemovedListener(listener: EventHandler1<PortEventArgs>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23PortStyleChanged">Online Documentation</a>
 */
override fun addPortStyleChangedListener(listener: EventHandler1<ItemChangedEventArgs<IPort, IPortStyle>>)
override fun removePortStyleChangedListener(listener: EventHandler1<ItemChangedEventArgs<IPort, IPortStyle>>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23PortLocationParameterChanged">Online Documentation</a>
 */
override fun addPortLocationParameterChangedListener(listener: EventHandler1<ItemChangedEventArgs<IPort, IPortLocationModelParameter>>)
override fun removePortLocationParameterChangedListener(listener: EventHandler1<ItemChangedEventArgs<IPort, IPortLocationModelParameter>>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23PortTagChanged">Online Documentation</a>
 */
override fun addPortTagChangedListener(listener: EventHandler1<ItemChangedEventArgs<IPort, Tag>>)
override fun removePortTagChangedListener(listener: EventHandler1<ItemChangedEventArgs<IPort, Tag>>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DisplaysInvalidated">Online Documentation</a>
 */
override fun addDisplaysInvalidatedListener(listener: EventHandler1<EventArgs>)
override fun removeDisplaysInvalidatedListener(listener: EventHandler1<EventArgs>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23ParentChanged">Online Documentation</a>
 */
override fun addParentChangedListener(listener: EventHandler1<NodeEventArgs>)
override fun removeParentChangedListener(listener: EventHandler1<NodeEventArgs>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23IsGroupNodeChanged">Online Documentation</a>
 */
override fun addIsGroupNodeChangedListener(listener: EventHandler1<NodeEventArgs>)
override fun removeIsGroupNodeChangedListener(listener: EventHandler1<NodeEventArgs>)

companion object : ClassMetadata<DefaultGraph> {
/**
 * Gets an [IContextLookup] that provides the default implementations returned by an [IBend]'s lookup.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DEFAULT_BEND_LOOKUP">Online Documentation</a>
 */
 val DEFAULT_BEND_LOOKUP: IContextLookup<IBend>
/**
 * Gets an [IContextLookup] that provides the default implementations returned by an [IEdge]'s lookup.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DEFAULT_EDGE_LOOKUP">Online Documentation</a>
 */
 val DEFAULT_EDGE_LOOKUP: IContextLookup<IEdge>
/**
 * Gets an [IContextLookup] that provides the default implementations returned by an [ILabel]'s lookup.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DEFAULT_LABEL_LOOKUP">Online Documentation</a>
 */
 val DEFAULT_LABEL_LOOKUP: IContextLookup<ILabel>
/**
 * Gets an [IContextLookup] that provides the default implementations returned by an [INode]'s lookup.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DEFAULT_NODE_LOOKUP">Online Documentation</a>
 */
 val DEFAULT_NODE_LOOKUP: IContextLookup<INode>
/**
 * Gets an [IContextLookup] that provides the default implementations returned by an [IPort]'s lookup.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultGraph%23DEFAULT_PORT_LOOKUP">Online Documentation</a>
 */
 val DEFAULT_PORT_LOOKUP: IContextLookup<IPort>
}
}

inline fun DefaultGraph(
    block: DefaultGraph.() -> Unit
): DefaultGraph {
    return DefaultGraph()
        .apply(block)
}
