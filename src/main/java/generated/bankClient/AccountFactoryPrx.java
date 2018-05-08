// **********************************************************************
//
// Copyright (c) 2003-2018 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.7.1
//
// <auto-generated>
//
// Generated from file `bankClient.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package generated.bankClient;

public interface AccountFactoryPrx extends com.zeroc.Ice.ObjectPrx
{
    default AccountPrx createAccount(Person person, double monthlyIncome)
        throws InvalidPeselStructure
    {
        return createAccount(person, monthlyIncome, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default AccountPrx createAccount(Person person, double monthlyIncome, java.util.Map<String, String> context)
        throws InvalidPeselStructure
    {
        try
        {
            return _iceI_createAccountAsync(person, monthlyIncome, context, true).waitForResponseOrUserEx();
        }
        catch(InvalidPeselStructure ex)
        {
            throw ex;
        }
        catch(com.zeroc.Ice.UserException ex)
        {
            throw new com.zeroc.Ice.UnknownUserException(ex.ice_id(), ex);
        }
    }

    default java.util.concurrent.CompletableFuture<AccountPrx> createAccountAsync(Person person, double monthlyIncome)
    {
        return _iceI_createAccountAsync(person, monthlyIncome, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<AccountPrx> createAccountAsync(Person person, double monthlyIncome, java.util.Map<String, String> context)
    {
        return _iceI_createAccountAsync(person, monthlyIncome, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<AccountPrx> _iceI_createAccountAsync(Person iceP_person, double iceP_monthlyIncome, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<AccountPrx> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "createAccount", null, sync, _iceE_createAccount);
        f.invoke(true, context, null, ostr -> {
                     ostr.writeValue(iceP_person);
                     ostr.writeDouble(iceP_monthlyIncome);
                     ostr.writePendingValues();
                 }, istr -> {
                     AccountPrx ret;
                     ret = AccountPrx.uncheckedCast(istr.readProxy());
                     return ret;
                 });
        return f;
    }

    static final Class<?>[] _iceE_createAccount =
    {
        InvalidPeselStructure.class
    };

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static AccountFactoryPrx checkedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, ice_staticId(), AccountFactoryPrx.class, _AccountFactoryPrxI.class);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param context The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static AccountFactoryPrx checkedCast(com.zeroc.Ice.ObjectPrx obj, java.util.Map<String, String> context)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, context, ice_staticId(), AccountFactoryPrx.class, _AccountFactoryPrxI.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static AccountFactoryPrx checkedCast(com.zeroc.Ice.ObjectPrx obj, String facet)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, facet, ice_staticId(), AccountFactoryPrx.class, _AccountFactoryPrxI.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @param context The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static AccountFactoryPrx checkedCast(com.zeroc.Ice.ObjectPrx obj, String facet, java.util.Map<String, String> context)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, facet, context, ice_staticId(), AccountFactoryPrx.class, _AccountFactoryPrxI.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param obj The untyped proxy.
     * @return A proxy for this type.
     **/
    static AccountFactoryPrx uncheckedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._uncheckedCast(obj, AccountFactoryPrx.class, _AccountFactoryPrxI.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @return A proxy for this type.
     **/
    static AccountFactoryPrx uncheckedCast(com.zeroc.Ice.ObjectPrx obj, String facet)
    {
        return com.zeroc.Ice.ObjectPrx._uncheckedCast(obj, facet, AccountFactoryPrx.class, _AccountFactoryPrxI.class);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the per-proxy context.
     * @param newContext The context for the new proxy.
     * @return A proxy with the specified per-proxy context.
     **/
    @Override
    default AccountFactoryPrx ice_context(java.util.Map<String, String> newContext)
    {
        return (AccountFactoryPrx)_ice_context(newContext);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the adapter ID.
     * @param newAdapterId The adapter ID for the new proxy.
     * @return A proxy with the specified adapter ID.
     **/
    @Override
    default AccountFactoryPrx ice_adapterId(String newAdapterId)
    {
        return (AccountFactoryPrx)_ice_adapterId(newAdapterId);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the endpoints.
     * @param newEndpoints The endpoints for the new proxy.
     * @return A proxy with the specified endpoints.
     **/
    @Override
    default AccountFactoryPrx ice_endpoints(com.zeroc.Ice.Endpoint[] newEndpoints)
    {
        return (AccountFactoryPrx)_ice_endpoints(newEndpoints);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the locator cache timeout.
     * @param newTimeout The new locator cache timeout (in seconds).
     * @return A proxy with the specified locator cache timeout.
     **/
    @Override
    default AccountFactoryPrx ice_locatorCacheTimeout(int newTimeout)
    {
        return (AccountFactoryPrx)_ice_locatorCacheTimeout(newTimeout);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the invocation timeout.
     * @param newTimeout The new invocation timeout (in seconds).
     * @return A proxy with the specified invocation timeout.
     **/
    @Override
    default AccountFactoryPrx ice_invocationTimeout(int newTimeout)
    {
        return (AccountFactoryPrx)_ice_invocationTimeout(newTimeout);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for connection caching.
     * @param newCache <code>true</code> if the new proxy should cache connections; <code>false</code> otherwise.
     * @return A proxy with the specified caching policy.
     **/
    @Override
    default AccountFactoryPrx ice_connectionCached(boolean newCache)
    {
        return (AccountFactoryPrx)_ice_connectionCached(newCache);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the endpoint selection policy.
     * @param newType The new endpoint selection policy.
     * @return A proxy with the specified endpoint selection policy.
     **/
    @Override
    default AccountFactoryPrx ice_endpointSelection(com.zeroc.Ice.EndpointSelectionType newType)
    {
        return (AccountFactoryPrx)_ice_endpointSelection(newType);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for how it selects endpoints.
     * @param b If <code>b</code> is <code>true</code>, only endpoints that use a secure transport are
     * used by the new proxy. If <code>b</code> is false, the returned proxy uses both secure and
     * insecure endpoints.
     * @return A proxy with the specified selection policy.
     **/
    @Override
    default AccountFactoryPrx ice_secure(boolean b)
    {
        return (AccountFactoryPrx)_ice_secure(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the encoding used to marshal parameters.
     * @param e The encoding version to use to marshal request parameters.
     * @return A proxy with the specified encoding version.
     **/
    @Override
    default AccountFactoryPrx ice_encodingVersion(com.zeroc.Ice.EncodingVersion e)
    {
        return (AccountFactoryPrx)_ice_encodingVersion(e);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its endpoint selection policy.
     * @param b If <code>b</code> is <code>true</code>, the new proxy will use secure endpoints for invocations
     * and only use insecure endpoints if an invocation cannot be made via secure endpoints. If <code>b</code> is
     * <code>false</code>, the proxy prefers insecure endpoints to secure ones.
     * @return A proxy with the specified selection policy.
     **/
    @Override
    default AccountFactoryPrx ice_preferSecure(boolean b)
    {
        return (AccountFactoryPrx)_ice_preferSecure(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the router.
     * @param router The router for the new proxy.
     * @return A proxy with the specified router.
     **/
    @Override
    default AccountFactoryPrx ice_router(com.zeroc.Ice.RouterPrx router)
    {
        return (AccountFactoryPrx)_ice_router(router);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the locator.
     * @param locator The locator for the new proxy.
     * @return A proxy with the specified locator.
     **/
    @Override
    default AccountFactoryPrx ice_locator(com.zeroc.Ice.LocatorPrx locator)
    {
        return (AccountFactoryPrx)_ice_locator(locator);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for collocation optimization.
     * @param b <code>true</code> if the new proxy enables collocation optimization; <code>false</code> otherwise.
     * @return A proxy with the specified collocation optimization.
     **/
    @Override
    default AccountFactoryPrx ice_collocationOptimized(boolean b)
    {
        return (AccountFactoryPrx)_ice_collocationOptimized(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses twoway invocations.
     * @return A proxy that uses twoway invocations.
     **/
    @Override
    default AccountFactoryPrx ice_twoway()
    {
        return (AccountFactoryPrx)_ice_twoway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses oneway invocations.
     * @return A proxy that uses oneway invocations.
     **/
    @Override
    default AccountFactoryPrx ice_oneway()
    {
        return (AccountFactoryPrx)_ice_oneway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses batch oneway invocations.
     * @return A proxy that uses batch oneway invocations.
     **/
    @Override
    default AccountFactoryPrx ice_batchOneway()
    {
        return (AccountFactoryPrx)_ice_batchOneway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses datagram invocations.
     * @return A proxy that uses datagram invocations.
     **/
    @Override
    default AccountFactoryPrx ice_datagram()
    {
        return (AccountFactoryPrx)_ice_datagram();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses batch datagram invocations.
     * @return A proxy that uses batch datagram invocations.
     **/
    @Override
    default AccountFactoryPrx ice_batchDatagram()
    {
        return (AccountFactoryPrx)_ice_batchDatagram();
    }

    /**
     * Returns a proxy that is identical to this proxy, except for compression.
     * @param co <code>true</code> enables compression for the new proxy; <code>false</code> disables compression.
     * @return A proxy with the specified compression setting.
     **/
    @Override
    default AccountFactoryPrx ice_compress(boolean co)
    {
        return (AccountFactoryPrx)_ice_compress(co);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its connection timeout setting.
     * @param t The connection timeout for the proxy in milliseconds.
     * @return A proxy with the specified timeout.
     **/
    @Override
    default AccountFactoryPrx ice_timeout(int t)
    {
        return (AccountFactoryPrx)_ice_timeout(t);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its connection ID.
     * @param connectionId The connection ID for the new proxy. An empty string removes the connection ID.
     * @return A proxy with the specified connection ID.
     **/
    @Override
    default AccountFactoryPrx ice_connectionId(String connectionId)
    {
        return (AccountFactoryPrx)_ice_connectionId(connectionId);
    }

    /**
     * Returns a proxy that is identical to this proxy, except it's a fixed proxy bound
     * the given connection.@param connection The fixed proxy connection.
     * @return A fixed proxy bound to the given connection.
     **/
    @Override
    default AccountFactoryPrx ice_fixed(com.zeroc.Ice.Connection connection)
    {
        return (AccountFactoryPrx)_ice_fixed(connection);
    }

    static String ice_staticId()
    {
        return "::bankClient::AccountFactory";
    }
}
