// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.lang.YFlags

/**
 * Specifies constants that define actions that change the [CanvasComponent.viewport] of a [CanvasComponent].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportChanges">Online Documentation</a>
 */
external class ViewportChanges 
    private constructor(): YFlags<ViewportChanges> {
    companion object {
    /**
 * None of the viewport changes should be animated.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportChanges%23NONE">Online Documentation</a>
 */
val NONE: ViewportChanges
/**
 * Changing the viewport via [CanvasComponent.autoDrag] should be animated.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportChanges%23AUTO_DRAG">Online Documentation</a>
 */
val AUTO_DRAG: ViewportChanges
/**
 * Changing the zoom of the viewport via mouse wheel should be animated.
 * 
 * Value - `2`
 * @see [CanvasComponent.mouseWheelBehavior]
 * @see [CanvasComponent.mouseWheelZoomFactor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportChanges%23MOUSE_WHEEL_ZOOM">Online Documentation</a>
 */
val MOUSE_WHEEL_ZOOM: ViewportChanges
/**
 * Scrolling the viewport via mouse wheel should be animated.
 * 
 * Value - `4`
 * @see [CanvasComponent.mouseWheelBehavior]
 * @see [CanvasComponent.mouseWheelScrollFactor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportChanges%23MOUSE_WHEEL_SCROLL">Online Documentation</a>
 */
val MOUSE_WHEEL_SCROLL: ViewportChanges
/**
 * Scrolling the viewport by changing the scroll bar values should be animated.
 * 
 * Value - `8`
 * @see [CanvasComponent.horizontalScrollBarPolicy]
 * @see [CanvasComponent.verticalScrollBarPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportChanges%23SCROLL_BAR">Online Documentation</a>
 */
val SCROLL_BAR: ViewportChanges
/**
 * Changing the zoom of the viewport via [ICommand.ZOOM][yfiles.input.ICommand.ZOOM], [ICommand.INCREASE_ZOOM][yfiles.input.ICommand.INCREASE_ZOOM], [ICommand.DECREASE_ZOOM][yfiles.input.ICommand.DECREASE_ZOOM], or [ICommand.ZOOM_TO_CURRENT_ITEM][yfiles.input.ICommand.ZOOM_TO_CURRENT_ITEM] should be animated.
 * 
 * Value - `16`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportChanges%23ZOOM_COMMAND">Online Documentation</a>
 */
val ZOOM_COMMAND: ViewportChanges
/**
 * Scrolling the viewport via [ICommand.SCROLL_PAGE_UP][yfiles.input.ICommand.SCROLL_PAGE_UP], [ICommand.SCROLL_PAGE_DOWN][yfiles.input.ICommand.SCROLL_PAGE_DOWN], [ICommand.SCROLL_PAGE_LEFT][yfiles.input.ICommand.SCROLL_PAGE_LEFT], or [ICommand.SCROLL_PAGE_RIGHT][yfiles.input.ICommand.SCROLL_PAGE_RIGHT] should be animated.
 * 
 * Value - `32`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportChanges%23SCROLL_COMMAND">Online Documentation</a>
 */
val SCROLL_COMMAND: ViewportChanges
/**
 * Changing the viewport via [ICommand.FIT_CONTENT][yfiles.input.ICommand.FIT_CONTENT] or [ICommand.FIT_GRAPH_BOUNDS][yfiles.input.ICommand.FIT_GRAPH_BOUNDS] should be animated.
 * 
 * Value - `64`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportChanges%23FIT_CONTENT_COMMAND">Online Documentation</a>
 */
val FIT_CONTENT_COMMAND: ViewportChanges
/**
 * Changing the viewport via [CanvasComponent.ensureVisible] should be animated.
 * 
 * Value - `128`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportChanges%23ENSURE_VISIBLE">Online Documentation</a>
 */
val ENSURE_VISIBLE: ViewportChanges
/**
 * All of the viewport changes should be animated.
 * 
 * Value - `255`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ViewportChanges%23ALL">Online Documentation</a>
 */
val ALL: ViewportChanges

    }
}
