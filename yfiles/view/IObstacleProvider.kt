// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.geometry.GeneralPath
import yfiles.lang.InterfaceMetadata

/**
 * Implementations of this interface can provide a path that is used to determine bridges by [BridgeManager].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IObstacleProvider">Online Documentation</a>
 */
external interface IObstacleProvider  {
  /**
   * Returns a path representing obstacles that would need bridges.
   * @param [context] The context for which the obstacles are queried.
   * @return A path that describes the obstacles or `null` if there are no obstacles for the given context.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IObstacleProvider%23IObstacleProvider-method-getObstacles">Online Documentation</a>
   */
  fun getObstacles(
    context: IRenderContext,
  ): GeneralPath?

  
  companion object : InterfaceMetadata<IObstacleProvider> {
  
    /**
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IObstacleProvider%23IObstacleProvider-method-create">Online Documentation</a>
     */
    @JsName("create")
    operator fun  invoke(
      getObstacles: (context: IRenderContext) -> GeneralPath
    ): IObstacleProvider
  }
}
