// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.IContextLookup
import yfiles.collections.IContextLookupChainLink
import yfiles.collections.ILookupDecorator
import yfiles.collections.LookupDecorator
import yfiles.input.IHandle
import yfiles.input.IHandleProvider
import yfiles.input.ILassoTestable
import yfiles.input.IMarqueeTestable
import yfiles.input.IPortSnapResultProvider
import yfiles.input.IPositionHandler
import yfiles.input.ISnapReferenceProvider
import yfiles.lang.ClassMetadata
import yfiles.lang.Func4
import yfiles.lang.IClassMetadata
import yfiles.styles.IEdgePathCropper
import yfiles.view.IFocusRenderer
import yfiles.view.IHighlightRenderer
import yfiles.view.IObstacleProvider
import yfiles.view.ISelectionRenderer

/**
 * Helps in [decorating][ILookupDecorator] the [lookup][yfiles.collections.ILookup] method of [IPort] instances by providing access to decorators for the most common types.
 * @see [GraphDecorator]
 * @see [LookupDecorator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDecorator">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [PortDecorator] class.
 * @param [decorator] The decorator to use.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDecorator%23PortDecorator-constructor-PortDecorator">Online Documentation</a>
 */
external class PortDecorator (
  decorator: ILookupDecorator  = definedExternally,
)  {
  /**
   * Gets a [LookupDecorator] that decorates the [IClipboardHelper] type for [IPort]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDecorator%23clipboardHelper">Online Documentation</a>
   */
  final val clipboardHelper: LookupDecorator<IPort, IClipboardHelper<IPort, *>>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IEdgePathCropper] type for [IPort]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDecorator%23edgePathCropper">Online Documentation</a>
   */
  final val edgePathCropper: LookupDecorator<IPort, IEdgePathCropper>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IFocusRenderer] type for [IPort]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDecorator%23focusRenderer">Online Documentation</a>
   */
  final val focusRenderer: LookupDecorator<IPort, IFocusRenderer<IPort>>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IHandle] type for [IPort]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDecorator%23handle">Online Documentation</a>
   */
  final val handle: LookupDecorator<IPort, IHandle>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IHandleProvider] type for [IPort]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDecorator%23handleProvider">Online Documentation</a>
   */
  final val handleProvider: LookupDecorator<IPort, IHandleProvider>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IHighlightRenderer] type for [IPort]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDecorator%23highlightRenderer">Online Documentation</a>
   */
  final val highlightRenderer: LookupDecorator<IPort, IHighlightRenderer<IPort>>
  
  /**
   * Gets a [LookupDecorator] that decorates the [ILassoTestable] type for [IPort]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDecorator%23lassoTestable">Online Documentation</a>
   */
  final val lassoTestable: LookupDecorator<IPort, ILassoTestable>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IMarqueeTestable] type for [IPort]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDecorator%23marqueeTestable">Online Documentation</a>
   */
  final val marqueeTestable: LookupDecorator<IPort, IMarqueeTestable>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IMementoSupport] type for [IPort]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDecorator%23mementoSupport">Online Documentation</a>
   */
  final val mementoSupport: LookupDecorator<IPort, IMementoSupport<IPort, *>>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IObstacleProvider] type for [IPort]s this instance has been created for.
   * @see [GraphObstacleProvider][yfiles.view.GraphObstacleProvider]
   * @see [BridgeManager][yfiles.view.BridgeManager]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDecorator%23obstacleProvider">Online Documentation</a>
   */
  final val obstacleProvider: LookupDecorator<IPort, IObstacleProvider>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IPositionHandler] type for [IPort]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDecorator%23positionHandler">Online Documentation</a>
   */
  final val positionHandler: LookupDecorator<IPort, IPositionHandler>
  
  /**
   * Gets a [LookupDecorator] that decorates the [ISelectionRenderer] type for [IPort]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDecorator%23selectionRenderer">Online Documentation</a>
   */
  final val selectionRenderer: LookupDecorator<IPort, ISelectionRenderer<IPort>>
  
  /**
   * Gets a [LookupDecorator] that decorates the [ISnapReferenceProvider] type for [IPort]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDecorator%23snapReferenceProvider">Online Documentation</a>
   */
  final val snapReferenceProvider: LookupDecorator<IPort, ISnapReferenceProvider>
  
  /**
   * Gets a [LookupDecorator] that decorates the [IPortSnapResultProvider] type for [IPort]s this instance has been created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDecorator%23snapResultProvider">Online Documentation</a>
   */
  final val snapResultProvider: LookupDecorator<IPort, IPortSnapResultProvider>
  
  /**
   * Adds an [IContextLookupChainLink].
   * @param [link] The lookup chain link to add.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDecorator%23PortDecorator-method-add">Online Documentation</a>
   */
  fun add(
    link: IContextLookupChainLink<IPort>,
  )
  
  /**
   * Adds an [IContextLookupChainLink].
   * @param [link] The lookup chain link to add.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDecorator%23PortDecorator-method-add">Online Documentation</a>
   */
  @JsName("add")
  final operator fun plusAssign(
    link: IContextLookupChainLink<IPort>,
  )
  
  /**
   * Adds a generic callback as a chain link to the lookup.
   * @param [genericLink] The generic callback to add to the lookup chain.
   * @return An [IContextLookupChainLink] that has been [added][ILookupDecorator] to the lookup.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDecorator%23PortDecorator-method-addGenericLookup">Online Documentation</a>
   */
  fun addGenericLookup(
    genericLink: Func4<IPort, IClassMetadata<*>, IContextLookup<*>, Any>,
  ): IContextLookupChainLink<*>
  
  /**
   * Creates a [LookupDecorator] for [IPort]s that can be used to decorate `TInterface` types of the ports.
   * @param [TInterface] The type of the interface that should be decorated of the instances' [lookup][yfiles.collections.ILookup].
   * @param [interfaceType] The type of the interface that should be decorated of the instances' [lookup][yfiles.collections.ILookup].
   * @return A new [LookupDecorator] for the specified interface.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDecorator%23PortDecorator-method-getDecoratorFor">Online Documentation</a>
   */
  fun <TInterface> getDecoratorFor(
    interfaceType: IClassMetadata<TInterface>,
  ): LookupDecorator<IPort, TInterface>
  
  /**
   * Removes an [IContextLookupChainLink] that has been added by one of the various decorators for ports.
   * @param [link] The lookup chain link to remove.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDecorator%23PortDecorator-method-remove">Online Documentation</a>
   */
  fun remove(
    link: IContextLookupChainLink<IPort>,
  )
  
  /**
   * Removes an [IContextLookupChainLink] that has been added by one of the various decorators for ports.
   * @param [link] The lookup chain link to remove.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDecorator%23PortDecorator-method-remove">Online Documentation</a>
   */
  @JsName("remove")
  final operator fun minusAssign(
    link: IContextLookupChainLink<IPort>,
  )
  
  companion object : ClassMetadata<PortDecorator> {
  }
}

inline operator fun  PortDecorator.invoke(
    block: PortDecorator.() -> Unit
): PortDecorator = apply(block)
