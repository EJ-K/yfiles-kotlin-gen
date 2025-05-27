// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.IPoint
import yfiles.geometry.Point
import yfiles.graph.IGraph
import yfiles.graph.IPort
import yfiles.graph.IPortLocationModel
import yfiles.graph.IPortLocationModelParameter
import yfiles.lang.ClassMetadata
import yfiles.lang.IEventDispatcher
import yfiles.view.Cursor

/**
 * An implementation of the [IHandle] that can be used to move an [IPort] interactively by assigning new [IPortLocationModelParameter]s to the [IPort.locationParameter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortLocationModelParameterHandle">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [PortLocationModelParameterHandle] class to change the [IPortLocationModelParameter] of the given `port`
 * @param [port] The port to adjust the location parameter of.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortLocationModelParameterHandle%23PortLocationModelParameterHandle-constructor-PortLocationModelParameterHandle">Online Documentation</a>
 * 
 * @property port
 * Gets the port this instance acts on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortLocationModelParameterHandle%23port">Online Documentation</a>
 */
external open class PortLocationModelParameterHandle  (
protected final val port: IPort) : IHandle {

/**
 * Gets or sets the cursor to display when the mouse hovers over or drags this handle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortLocationModelParameterHandle%23cursor">Online Documentation</a>
 */
final override var cursor: Cursor
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortLocationModelParameterHandle%23location">Online Documentation</a>
 */
final override val location: IPoint
/**
 * Gets or sets the type of the handle that can be used by the rendering engine to render types differently.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortLocationModelParameterHandle%23type">Online Documentation</a>
 */
final override var type: HandleTypes
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortLocationModelParameterHandle%23PortLocationModelParameterHandle-method-cancelDrag">Online Documentation</a>
 */
 override   fun cancelDrag( context: IInputModeContext ,
 originalLocation: Point )
/**
 * Called during the drag to collect snap results.
 * @param [source] The source of the event.
 * @param [event] The [CollectSnapResultsEventArgs] instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortLocationModelParameterHandle%23PortLocationModelParameterHandle-method-collectSnapResults">Online Documentation</a>
 */
 open protected   fun collectSnapResults( source: IEventDispatcher ,
 event: CollectSnapResultsEventArgs )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortLocationModelParameterHandle%23PortLocationModelParameterHandle-method-dragFinished">Online Documentation</a>
 */
 override   fun dragFinished( context: IInputModeContext ,
 originalLocation: Point ,
 newLocation: Point )
/**
 * Gets the graph to use for [setting the parameter][IGraph.setPortLocationParameter] from the context.
 * @param [context] The input mode context to use.
 * @return The graph or `null` if the graph could not be obtained.
 * @see [IInputModeContext.graph]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortLocationModelParameterHandle%23PortLocationModelParameterHandle-method-getGraph">Online Documentation</a>
 */
 open protected   fun getGraph( context: IInputModeContext ):IGraph?
/**
 * Determines the type of the movement for the given port.
 * @param [port] The port to determine the move type for.
 * @return This implementation returns [MoveTypes.LINEAR_MOVE] for models of type [FreeNodePortLocationModel][yfiles.graph.FreeNodePortLocationModel] and [MoveTypes.ARBITRARY_MOVE] for all others.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortLocationModelParameterHandle%23PortLocationModelParameterHandle-method-getMoveType">Online Documentation</a>
 */
 open protected   fun getMoveType( port: IPort ):MoveTypes
/**
 * Obtains the new parameter for the given location and port.
 * @param [port] The port to obtain a parameter for.
 * @param [model] The model to use.
 * @param [location] The new location.
 * @return The new parameter to use.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortLocationModelParameterHandle%23PortLocationModelParameterHandle-method-getNewParameter">Online Documentation</a>
 */
 open protected   fun getNewParameter( port: IPort ,
 model: IPortLocationModel ,
 location: Point ):IPortLocationModelParameter
/**
 * Ignore clicking the handle.
 * @param [event] Arguments describing the click.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortLocationModelParameterHandle%23PortLocationModelParameterHandle-method-handleClick">Online Documentation</a>
 */
 override   fun handleClick( event: ClickEventArgs )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortLocationModelParameterHandle%23PortLocationModelParameterHandle-method-handleMove">Online Documentation</a>
 */
 override   fun handleMove( context: IInputModeContext ,
 originalLocation: Point ,
 newLocation: Point )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortLocationModelParameterHandle%23PortLocationModelParameterHandle-method-initializeDrag">Online Documentation</a>
 */
 override   fun initializeDrag( context: IInputModeContext )
/**
 * Applies the parameter.
 * @param [graph] The graph to use for applying.
 * @param [port] The port to apply the parameter to.
 * @param [locationParameter] The new parameter to apply.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortLocationModelParameterHandle%23PortLocationModelParameterHandle-method-setParameter">Online Documentation</a>
 */
 open protected   fun setParameter( graph: IGraph ,
 port: IPort ,
 locationParameter: IPortLocationModelParameter )

companion object : ClassMetadata<PortLocationModelParameterHandle> {
}
}
