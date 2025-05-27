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
 * An abstract [IGraph] implementation that delegates all of its work to an existing implementation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase">Online Documentation</a>
 * 
 * @constructor Creates a new instance that wraps a given [IGraph].
 * @param [graph] The graph to wrap.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-constructor-GraphWrapperBase">Online Documentation</a>
 */
external abstract class GraphWrapperBase 
protected constructor ( graph: IGraph ) : IGraph {

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23edgeDefaults">Online Documentation</a>
 */
override var edgeDefaults: IEdgeDefaults
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23edges">Online Documentation</a>
 */
override val edges: IListEnumerable<IEdge>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23groupNodeDefaults">Online Documentation</a>
 */
override var groupNodeDefaults: INodeDefaults
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23labels">Online Documentation</a>
 */
override val labels: IListEnumerable<ILabel>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23mapperRegistry">Online Documentation</a>
 */
override val mapperRegistry: IMapperRegistry
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23nodeDefaults">Online Documentation</a>
 */
override var nodeDefaults: INodeDefaults
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23nodes">Online Documentation</a>
 */
override val nodes: IListEnumerable<INode>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23ports">Online Documentation</a>
 */
override val ports: IListEnumerable<IPort>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23tag">Online Documentation</a>
 */
final override var tag: Tag?
/**
 * Gets the graph that has been wrapped by this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23wrappedGraph">Online Documentation</a>
 */
final var wrappedGraph: IGraph?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-addBend">Online Documentation</a>
 */
 override   fun addBend( edge: IEdge ,
 location: Point ,
 index: Int ):IBend
/**
 * Adds event handlers that propagate graph events from `graph` to listeners on this instance.
 * @param [graph] The graph for which event propagators should be created
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-addEventHandlers">Online Documentation</a>
 */
 open protected   fun addEventHandlers( graph: IGraph )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-addLabel">Online Documentation</a>
 */
 override   fun addLabel( owner: ILabelOwner ,
 text: String ,
 layoutParameter: ILabelModelParameter? ,
 style: ILabelStyle? ,
 preferredSize: Size? ,
 tag: Tag? ):ILabel
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-addPort">Online Documentation</a>
 */
 override   fun addPort( owner: IPortOwner ,
 locationParameter: IPortLocationModelParameter? ,
 style: IPortStyle? ,
 tag: Tag? ):IPort
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-contains">Online Documentation</a>
 */
 override  operator fun contains( item: IModelItem ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-createEdge">Online Documentation</a>
 */
 override   fun createEdge( sourcePort: IPort ,
 targetPort: IPort ,
 style: IEdgeStyle? ,
 tag: Tag? ):IEdge
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-createEdge">Online Documentation</a>
 */
 override   fun createEdge( source: INode ,
 target: INode ,
 style: IEdgeStyle? ,
 tag: Tag? ):IEdge
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-createGroupNode">Online Documentation</a>
 */
 override   fun createGroupNode( parent: INode? ,
 layout: Rect? ,
 style: INodeStyle? ,
 tag: Tag? ):INode
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-createNode">Online Documentation</a>
 */
 override   fun createNode( layout: Rect ,
 style: INodeStyle? ,
 tag: Tag? ):INode
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-createNode">Online Documentation</a>
 */
 override   fun createNode( parent: INode? ,
 layout: Rect? ,
 style: INodeStyle? ,
 tag: Tag? ):INode
/**
 * Clears the internal state of this instance and released memory and bound listeners.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-dispose">Online Documentation</a>
 */
 open   fun dispose()
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-edgesAt">Online Documentation</a>
 */
 override   fun edgesAt( port: IPort ,
 type: AdjacencyTypes ):IListEnumerable<IEdge>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-edgesAt">Online Documentation</a>
 */
 override   fun edgesAt( owner: IPortOwner ,
 type: AdjacencyTypes ):IListEnumerable<IEdge>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-getChildren">Online Documentation</a>
 */
 override   fun getChildren( node: INode? ):IListEnumerable<INode>
/**
 * Gets the lookup instance to use in [lookup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-getLookup">Online Documentation</a>
 */
 open   fun getLookup():ILookup?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-getParent">Online Documentation</a>
 */
 override   fun getParent( node: INode ):INode?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-invalidateDisplays">Online Documentation</a>
 */
 override   fun invalidateDisplays()
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-isGroupNode">Online Documentation</a>
 */
 override   fun isGroupNode( node: INode ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-lookup">Online Documentation</a>
 */
 override   fun <T : YObject>lookup( type: YClass<T> ):T?
/**
 * Raises the [BendAdded] event
 * @param [event] The parameters for the event
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onBendAdded">Online Documentation</a>
 */
 open protected   fun onBendAdded( event: ItemEventArgs<IBend> )
/**
 * Raises the [BendLocationChanged] event
 * @param [bend] The bend whose location changed
 * @param [oldLocation] The bend location before the change
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onBendLocationChanged">Online Documentation</a>
 */
 open protected   fun onBendLocationChanged( bend: IBend ,
 oldLocation: Point )
/**
 * Raises the [BendRemoved] event
 * @param [event] The parameters for the event
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onBendRemoved">Online Documentation</a>
 */
 open protected   fun onBendRemoved( event: BendEventArgs )
/**
 * Raises the [BendTagChanged] event
 * @param [event] The parameters for the event
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onBendTagChanged">Online Documentation</a>
 */
 open protected   fun onBendTagChanged( event: ItemChangedEventArgs<IBend, Tag> )
/**
 * Raises the [EdgeCreated] event
 * @param [event] The parameters for the event
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onEdgeCreated">Online Documentation</a>
 */
 open protected   fun onEdgeCreated( event: ItemEventArgs<IEdge> )
/**
 * Raises the [EdgePortsChanged] event
 * @param [event] The parameters for the event
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onEdgePortsChanged">Online Documentation</a>
 */
 open protected   fun onEdgePortsChanged( event: EdgeEventArgs )
/**
 * Raises the [EdgeRemoved] event
 * @param [event] The parameters for the event
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onEdgeRemoved">Online Documentation</a>
 */
 open protected   fun onEdgeRemoved( event: EdgeEventArgs )
/**
 * Raises the [EdgeStyleChanged] event
 * @param [event] The parameters for the event
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onEdgeStyleChanged">Online Documentation</a>
 */
 open protected   fun onEdgeStyleChanged( event: ItemChangedEventArgs<IEdge, IEdgeStyle> )
/**
 * Raises the [EdgeTagChanged] event
 * @param [event] The parameters for the event
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onEdgeTagChanged">Online Documentation</a>
 */
 open protected   fun onEdgeTagChanged( event: ItemChangedEventArgs<IEdge, Tag> )
/**
 * Called when the [wrappedGraph] property value changes and after initialization of the field.
 * @param [oldGraph] the old value, which may be `null` the first time
 * @param [newGraph] the new value
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onGraphChanged">Online Documentation</a>
 */
 open protected   fun onGraphChanged( oldGraph: IGraph? ,
 newGraph: IGraph? )
/**
 * Raises the [GraphTagChanged] event
 * @param [event] The parameters for the event
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onGraphTagChanged">Online Documentation</a>
 */
 open protected   fun onGraphTagChanged( event: ItemChangedEventArgs<IGraph, Tag> )
/**
 * Raises the [DisplaysInvalidated] event
 * @param [event] The parameters for the event
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onInvalidateDisplays">Online Documentation</a>
 */
 open protected   fun onInvalidateDisplays( event: EventArgs )
/**
 * Dispatches the [IsGroupNodeChanged] event.
 * @param [event] The event args to dispatch.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onIsGroupNodeChanged">Online Documentation</a>
 */
 open protected   fun onIsGroupNodeChanged( event: NodeEventArgs )
/**
 * Raises the [LabelAdded] event
 * @param [event] The parameters for the event
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onLabelAdded">Online Documentation</a>
 */
 open protected   fun onLabelAdded( event: ItemEventArgs<ILabel> )
/**
 * Raises the [LabelLayoutParameterChanged] event
 * @param [event] The parameters for the event
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onLabelLayoutParameterChanged">Online Documentation</a>
 */
 open protected   fun onLabelLayoutParameterChanged( event: ItemChangedEventArgs<ILabel, ILabelModelParameter> )
/**
 * Raises the [LabelPreferredSizeChanged] event
 * @param [event] The parameters for the event
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onLabelPreferredSizeChanged">Online Documentation</a>
 */
 open protected   fun onLabelPreferredSizeChanged( event: ItemChangedEventArgs<ILabel, Size> )
/**
 * Raises the [LabelRemoved] event
 * @param [event] The parameters for the event
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onLabelRemoved">Online Documentation</a>
 */
 open protected   fun onLabelRemoved( event: LabelEventArgs )
/**
 * Raises the [LabelStyleChanged] event
 * @param [event] The parameters for the event
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onLabelStyleChanged">Online Documentation</a>
 */
 open protected   fun onLabelStyleChanged( event: ItemChangedEventArgs<ILabel, ILabelStyle> )
/**
 * Raises the [LabelTagChanged] event
 * @param [event] The parameters for the event
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onLabelTagChanged">Online Documentation</a>
 */
 open protected   fun onLabelTagChanged( event: ItemChangedEventArgs<ILabel, Tag> )
/**
 * Raises the [LabelTextChanged] event
 * @param [event] The parameters for the event
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onLabelTextChanged">Online Documentation</a>
 */
 open protected   fun onLabelTextChanged( event: ItemChangedEventArgs<ILabel, String> )
/**
 * Raises the [NodeCreated] event
 * @param [event] The parameters for the event
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onNodeCreated">Online Documentation</a>
 */
 open protected   fun onNodeCreated( event: ItemEventArgs<INode> )
/**
 * Raises the [NodeLayoutChanged] event
 * @param [node] The node whose layout changed
 * @param [oldLayout] The node layout before the change
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onNodeLayoutChanged">Online Documentation</a>
 */
 open protected   fun onNodeLayoutChanged( node: INode ,
 oldLayout: Rect )
/**
 * Raises the [NodeRemoved] event
 * @param [event] The parameters for the event
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onNodeRemoved">Online Documentation</a>
 */
 open protected   fun onNodeRemoved( event: NodeEventArgs )
/**
 * Raises the [NodeStyleChanged] event
 * @param [event] The parameters for the event
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onNodeStyleChanged">Online Documentation</a>
 */
 open protected   fun onNodeStyleChanged( event: ItemChangedEventArgs<INode, INodeStyle> )
/**
 * Raises the [NodeTagChanged] event
 * @param [event] The parameters for the event
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onNodeTagChanged">Online Documentation</a>
 */
 open protected   fun onNodeTagChanged( event: ItemChangedEventArgs<INode, Tag> )
/**
 * Dispatches the [ParentChanged] event.
 * @param [event] The event args to dispatch.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onParentChanged">Online Documentation</a>
 */
 open protected   fun onParentChanged( event: NodeEventArgs )
/**
 * Raises the [PortAdded] event
 * @param [event] The parameters for the event
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onPortAdded">Online Documentation</a>
 */
 open protected   fun onPortAdded( event: ItemEventArgs<IPort> )
/**
 * Raises the [PortLocationParameterChanged] event
 * @param [event] The parameters for the event
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onPortLocationParameterChanged">Online Documentation</a>
 */
 open protected   fun onPortLocationParameterChanged( event: ItemChangedEventArgs<IPort, IPortLocationModelParameter> )
/**
 * Raises the [PortRemoved] event
 * @param [event] The parameters for the event
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onPortRemoved">Online Documentation</a>
 */
 open protected   fun onPortRemoved( event: PortEventArgs )
/**
 * Raises the [PortStyleChanged] event
 * @param [event] The parameters for the event
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onPortStyleChanged">Online Documentation</a>
 */
 open protected   fun onPortStyleChanged( event: ItemChangedEventArgs<IPort, IPortStyle> )
/**
 * Raises the [PortTagChanged] event
 * @param [event] The parameters for the event
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onPortTagChanged">Online Documentation</a>
 */
 open protected   fun onPortTagChanged( event: ItemChangedEventArgs<IPort, Tag> )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-remove">Online Documentation</a>
 */
 override   fun remove( item: IModelItem )
/**
 * Removes event handlers for `graph` that have been added with [addEventHandlers].
 * @param [graph] The graph for which event propagators should be removed
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-removeEventHandlers">Online Documentation</a>
 */
 open protected   fun removeEventHandlers( graph: IGraph )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-setBendLocation">Online Documentation</a>
 */
 override   fun setBendLocation( bend: IBend ,
 location: Point )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-setEdgePorts">Online Documentation</a>
 */
 override   fun setEdgePorts( edge: IEdge ,
 sourcePort: IPort ,
 targetPort: IPort )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-setIsGroupNode">Online Documentation</a>
 */
 override   fun setIsGroupNode( node: INode ,
 isGroupNode: Boolean )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-setLabelLayoutParameter">Online Documentation</a>
 */
 override   fun setLabelLayoutParameter( label: ILabel ,
 layoutParameter: ILabelModelParameter )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-setLabelPreferredSize">Online Documentation</a>
 */
 override   fun setLabelPreferredSize( label: ILabel ,
 preferredSize: Size )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-setLabelText">Online Documentation</a>
 */
 override   fun setLabelText( label: ILabel ,
 text: String )
/**
 * Sets the lookup instance to use in [lookup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-setLookup">Online Documentation</a>
 */
 open   fun setLookup( lookup: ILookup? )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-setNodeLayout">Online Documentation</a>
 */
 override   fun setNodeLayout( node: INode ,
 layout: Rect )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-setParent">Online Documentation</a>
 */
 override   fun setParent( node: INode ,
 parent: INode? )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-setPortLocationParameter">Online Documentation</a>
 */
 override   fun setPortLocationParameter( port: IPort ,
 locationParameter: IPortLocationModelParameter )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-setStyle">Online Documentation</a>
 */
 override   fun setStyle( node: INode ,
 style: INodeStyle )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-setStyle">Online Documentation</a>
 */
 override   fun setStyle( label: ILabel ,
 style: ILabelStyle )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-setStyle">Online Documentation</a>
 */
 override   fun setStyle( edge: IEdge ,
 style: IEdgeStyle )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-setStyle">Online Documentation</a>
 */
 override   fun setStyle( port: IPort ,
 style: IPortStyle )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphTagChanged">Online Documentation</a>
 */
override fun addGraphTagChangedListener(listener: EventHandler1<ItemChangedEventArgs<IGraph, Tag>>)
override fun removeGraphTagChangedListener(listener: EventHandler1<ItemChangedEventArgs<IGraph, Tag>>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23NodeCreated">Online Documentation</a>
 */
override fun addNodeCreatedListener(listener: EventHandler1<ItemEventArgs<INode>>)
override fun removeNodeCreatedListener(listener: EventHandler1<ItemEventArgs<INode>>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23NodeRemoved">Online Documentation</a>
 */
override fun addNodeRemovedListener(listener: EventHandler1<NodeEventArgs>)
override fun removeNodeRemovedListener(listener: EventHandler1<NodeEventArgs>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23NodeStyleChanged">Online Documentation</a>
 */
override fun addNodeStyleChangedListener(listener: EventHandler1<ItemChangedEventArgs<INode, INodeStyle>>)
override fun removeNodeStyleChangedListener(listener: EventHandler1<ItemChangedEventArgs<INode, INodeStyle>>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23NodeLayoutChanged">Online Documentation</a>
 */
override fun addNodeLayoutChangedListener(listener: NodeLayoutChangedHandler)
override fun removeNodeLayoutChangedListener(listener: NodeLayoutChangedHandler)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23NodeTagChanged">Online Documentation</a>
 */
override fun addNodeTagChangedListener(listener: EventHandler1<ItemChangedEventArgs<INode, Tag>>)
override fun removeNodeTagChangedListener(listener: EventHandler1<ItemChangedEventArgs<INode, Tag>>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23EdgeCreated">Online Documentation</a>
 */
override fun addEdgeCreatedListener(listener: EventHandler1<ItemEventArgs<IEdge>>)
override fun removeEdgeCreatedListener(listener: EventHandler1<ItemEventArgs<IEdge>>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23EdgeRemoved">Online Documentation</a>
 */
override fun addEdgeRemovedListener(listener: EventHandler1<EdgeEventArgs>)
override fun removeEdgeRemovedListener(listener: EventHandler1<EdgeEventArgs>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23EdgeStyleChanged">Online Documentation</a>
 */
override fun addEdgeStyleChangedListener(listener: EventHandler1<ItemChangedEventArgs<IEdge, IEdgeStyle>>)
override fun removeEdgeStyleChangedListener(listener: EventHandler1<ItemChangedEventArgs<IEdge, IEdgeStyle>>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23EdgePortsChanged">Online Documentation</a>
 */
override fun addEdgePortsChangedListener(listener: EventHandler1<EdgeEventArgs>)
override fun removeEdgePortsChangedListener(listener: EventHandler1<EdgeEventArgs>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23EdgeTagChanged">Online Documentation</a>
 */
override fun addEdgeTagChangedListener(listener: EventHandler1<ItemChangedEventArgs<IEdge, Tag>>)
override fun removeEdgeTagChangedListener(listener: EventHandler1<ItemChangedEventArgs<IEdge, Tag>>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23BendAdded">Online Documentation</a>
 */
override fun addBendAddedListener(listener: EventHandler1<ItemEventArgs<IBend>>)
override fun removeBendAddedListener(listener: EventHandler1<ItemEventArgs<IBend>>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23BendRemoved">Online Documentation</a>
 */
override fun addBendRemovedListener(listener: EventHandler1<BendEventArgs>)
override fun removeBendRemovedListener(listener: EventHandler1<BendEventArgs>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23BendLocationChanged">Online Documentation</a>
 */
override fun addBendLocationChangedListener(listener: BendLocationChangedHandler)
override fun removeBendLocationChangedListener(listener: BendLocationChangedHandler)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23BendTagChanged">Online Documentation</a>
 */
override fun addBendTagChangedListener(listener: EventHandler1<ItemChangedEventArgs<IBend, Tag>>)
override fun removeBendTagChangedListener(listener: EventHandler1<ItemChangedEventArgs<IBend, Tag>>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23LabelAdded">Online Documentation</a>
 */
override fun addLabelAddedListener(listener: EventHandler1<ItemEventArgs<ILabel>>)
override fun removeLabelAddedListener(listener: EventHandler1<ItemEventArgs<ILabel>>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23LabelRemoved">Online Documentation</a>
 */
override fun addLabelRemovedListener(listener: EventHandler1<LabelEventArgs>)
override fun removeLabelRemovedListener(listener: EventHandler1<LabelEventArgs>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23LabelStyleChanged">Online Documentation</a>
 */
override fun addLabelStyleChangedListener(listener: EventHandler1<ItemChangedEventArgs<ILabel, ILabelStyle>>)
override fun removeLabelStyleChangedListener(listener: EventHandler1<ItemChangedEventArgs<ILabel, ILabelStyle>>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23LabelPreferredSizeChanged">Online Documentation</a>
 */
override fun addLabelPreferredSizeChangedListener(listener: EventHandler1<ItemChangedEventArgs<ILabel, Size>>)
override fun removeLabelPreferredSizeChangedListener(listener: EventHandler1<ItemChangedEventArgs<ILabel, Size>>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23LabelTextChanged">Online Documentation</a>
 */
override fun addLabelTextChangedListener(listener: EventHandler1<ItemChangedEventArgs<ILabel, String>>)
override fun removeLabelTextChangedListener(listener: EventHandler1<ItemChangedEventArgs<ILabel, String>>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23LabelLayoutParameterChanged">Online Documentation</a>
 */
override fun addLabelLayoutParameterChangedListener(listener: EventHandler1<ItemChangedEventArgs<ILabel, ILabelModelParameter>>)
override fun removeLabelLayoutParameterChangedListener(listener: EventHandler1<ItemChangedEventArgs<ILabel, ILabelModelParameter>>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23LabelTagChanged">Online Documentation</a>
 */
override fun addLabelTagChangedListener(listener: EventHandler1<ItemChangedEventArgs<ILabel, Tag>>)
override fun removeLabelTagChangedListener(listener: EventHandler1<ItemChangedEventArgs<ILabel, Tag>>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23PortAdded">Online Documentation</a>
 */
override fun addPortAddedListener(listener: EventHandler1<ItemEventArgs<IPort>>)
override fun removePortAddedListener(listener: EventHandler1<ItemEventArgs<IPort>>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23PortRemoved">Online Documentation</a>
 */
override fun addPortRemovedListener(listener: EventHandler1<PortEventArgs>)
override fun removePortRemovedListener(listener: EventHandler1<PortEventArgs>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23PortStyleChanged">Online Documentation</a>
 */
override fun addPortStyleChangedListener(listener: EventHandler1<ItemChangedEventArgs<IPort, IPortStyle>>)
override fun removePortStyleChangedListener(listener: EventHandler1<ItemChangedEventArgs<IPort, IPortStyle>>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23PortLocationParameterChanged">Online Documentation</a>
 */
override fun addPortLocationParameterChangedListener(listener: EventHandler1<ItemChangedEventArgs<IPort, IPortLocationModelParameter>>)
override fun removePortLocationParameterChangedListener(listener: EventHandler1<ItemChangedEventArgs<IPort, IPortLocationModelParameter>>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23PortTagChanged">Online Documentation</a>
 */
override fun addPortTagChangedListener(listener: EventHandler1<ItemChangedEventArgs<IPort, Tag>>)
override fun removePortTagChangedListener(listener: EventHandler1<ItemChangedEventArgs<IPort, Tag>>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23DisplaysInvalidated">Online Documentation</a>
 */
override fun addDisplaysInvalidatedListener(listener: EventHandler1<EventArgs>)
override fun removeDisplaysInvalidatedListener(listener: EventHandler1<EventArgs>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23ParentChanged">Online Documentation</a>
 */
override fun addParentChangedListener(listener: EventHandler1<NodeEventArgs>)
override fun removeParentChangedListener(listener: EventHandler1<NodeEventArgs>)

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23IsGroupNodeChanged">Online Documentation</a>
 */
override fun addIsGroupNodeChangedListener(listener: EventHandler1<NodeEventArgs>)
override fun removeIsGroupNodeChangedListener(listener: EventHandler1<NodeEventArgs>)

companion object : ClassMetadata<GraphWrapperBase> {
}
}
