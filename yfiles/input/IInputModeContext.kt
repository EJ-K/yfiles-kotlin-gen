// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import js.core.Void
import yfiles.graph.IGraph
import yfiles.graph.ILookup
import yfiles.graph.LookupCallback
import yfiles.lang.InterfaceMetadata
import yfiles.view.CanvasComponent
import yfiles.view.ICanvasContext

/**
 * The interface for the context object that is passed to [IInputMode] instances during [IInputMode.install] and [IInputMode.uninstall] and [IDragHandler] implementations like [IPositionHandler] and [IHandle] to provide additional context for the implementations.
 * @see [ILookup]
 * @see [IInputMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IInputModeContext">Online Documentation</a>
 */
external interface IInputModeContext : ICanvasContext {
/**
 * Tries to retrieve an [IGraph] instance from an [IInputModeContext].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IInputModeContext%23graph">Online Documentation</a>
 */
final val graph: IGraph?
/**
 * Gets the [IInputMode] which issued the context object.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IInputModeContext%23parentInputMode">Online Documentation</a>
 */
val parentInputMode: IInputMode?
/**
 * Tries to call [IGraph.invalidateDisplays] on the [graph] obtains from the [IInputModeContext].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IInputModeContext%23IInputModeContext-defaultmethod-invalidateDisplays">Online Documentation</a>
 */
  final  fun invalidateDisplays():Unit = definedExternally

companion object : InterfaceMetadata<IInputModeContext> {
/**
 * An empty context where both the input mode and the canvas is `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IInputModeContext%23EMPTY">Online Documentation</a>
 */
 val EMPTY: IInputModeContext
/**
 * Factory method that creates an [IInputModeContext] that uses the provided parent mode and lookup decoration.
 * @param [parent] The input mode this context is created for.
 * @param [lookup] The [ILookup] implementation which is used for this context's [ILookup.lookup] method. If one is provided it is used exclusively, i.e. the [ILookup.lookup] method returns null if `lookup` returns `null`. If none is provided, the `parent`'s [IInputMode.inputModeContext]'s [ILookup.lookup] is queried.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IInputModeContext%23IInputModeContext-defaultmethod-createInputModeContext(IInputMode,ILookup)">Online Documentation</a>
 */
@JsName("createInputModeContext")
  operator fun invoke( parent: IInputMode ,
 lookup: ILookup?  = definedExternally):IInputModeContext
/**
 * Factory method that creates an [IInputModeContext] that uses the provided parent mode and lookup decoration.
 * @param [parent] The input mode this context is created for.
 * @param [lookupCallback] Callback which is used by this context's [ILookup.lookup] method. The callback is used exclusively, i.e. the [ILookup.lookup] method returns null if the callback returns `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IInputModeContext%23IInputModeContext-defaultmethod-createInputModeContext(IInputMode,LookupCallback)">Online Documentation</a>
 */
@JsName("createInputModeContext")
  operator fun invoke( parent: IInputMode ,
 lookupCallback: LookupCallback<Void> ):IInputModeContext
/**
 * Factory method that creates an [IInputModeContext] that uses the provided parent mode, parent context, and lookup decoration.
 * @param [parent] The input mode this context is created for.
 * @param [parentContext] A wrapped [IInputModeContext]. This implementation delegates to to this context.
 * @param [lookup] A [ILookup] implementation which is used for this context's [ILookup.lookup] method. The context's [ILookup.lookup] will query `lookup` first. If it returns `null`, the `parentContext`'s [ILookup.lookup] will be queried, then.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IInputModeContext%23IInputModeContext-defaultmethod-createInputModeContext(IInputMode,IInputModeContext,ILookup)">Online Documentation</a>
 */
@JsName("createInputModeContext")
  operator fun invoke( parent: IInputMode ,
 parentContext: IInputModeContext ,
 lookup: ILookup ):IInputModeContext
/**
 * Factory method that creates an [IInputModeContext] that uses the provided parent mode, parent context, and lookup decoration.
 * @param [parent] The input mode this context is created for.
 * @param [parentContext] A wrapped [IInputModeContext]. This implementation delegates to to this context.
 * @param [lookupCallback] A callback which is used for this context's [ILookup.lookup] method. The context's [ILookup.lookup] will query `lookupCallback` first. If it returns `null`, the `parentContext`'s [ILookup.lookup] will be queried, then.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IInputModeContext%23IInputModeContext-defaultmethod-createInputModeContext(IInputMode,IInputModeContext,LookupCallback)">Online Documentation</a>
 */
@JsName("createInputModeContext")
  operator fun invoke( parent: IInputMode ,
 parentContext: IInputModeContext ,
 lookupCallback: LookupCallback<Void> ):IInputModeContext
/**
 * Factory method that creates an [IInputModeContext] that uses the provided values.
 * @param [canvas] The [CanvasComponent] to use, may not be `null`.
 * @param [parent] The mode to set as the parent. This may be `null` for the canvas' context.
 * @param [lookup] The lookup to use.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IInputModeContext%23IInputModeContext-defaultmethod-createInputModeContext(CanvasComponent,IInputMode,ILookup)">Online Documentation</a>
 */
@JsName("createInputModeContext")
  operator fun invoke( canvas: CanvasComponent ,
 parent: IInputMode?  = definedExternally,
 lookup: ILookup?  = definedExternally):IInputModeContext
}
}
